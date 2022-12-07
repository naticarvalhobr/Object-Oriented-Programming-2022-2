package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.DAO.connectionDB.ConnectionJDBC;
import model.persistence.Endereco;
import model.persistence.Usuario;

public class UsuarioDAO {

    private Connection con;
    private String sqlUsuario = null;
    private String sqlEndereco = null;
    private PreparedStatement psUsuario = null;
    private PreparedStatement psEndereco = null;
    private ResultSet rs = null;

    public boolean salvar(Usuario user) throws ClassNotFoundException {
        con = new ConnectionJDBC().getConnection();
        
        sqlEndereco = "insert into endereco(logradouro, bairro, pais, uf, cep) values (?,?,?,?,?)";
        sqlUsuario = "insert into usuario(nome, cpf, rg, sexo, endereco) values (?,?,?,?,?)";
        
        try{
            
            psEndereco = con.prepareStatement(sqlEndereco,Statement.RETURN_GENERATED_KEYS);
            psEndereco.setString(1, user.getEndereco().getLogradouro());
            psEndereco.setString(2, user.getEndereco().getBairro());
            psEndereco.setString(3, user.getEndereco().getPais());
            psEndereco.setString(4, user.getEndereco().getUf());
            psEndereco.setString(5, user.getEndereco().getCep());
            psEndereco.executeUpdate();
            
            ResultSet rs = psEndereco.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            System.out.println(id);
            
           
            psUsuario = con.prepareStatement(sqlUsuario);
            psUsuario.setString(1, user.getNome());
            psUsuario.setString(2, user.getCpf());
            psUsuario.setString(3, user.getRg());
            psUsuario.setString(4, user.getSexo());
            psUsuario.setInt(5, id);
            
            psUsuario.executeUpdate();
             
        }catch(SQLException e){
            e.printStackTrace();
        }

        return true;
    }
    
    public List<Usuario> listar() throws SQLException, ClassNotFoundException{
        
        con = new ConnectionJDBC().getConnection();
        sqlUsuario = "select * from usuario as u, endereco as e where u.endereco = e.id";
        psUsuario = con.prepareStatement(sqlUsuario);
        rs = psUsuario.executeQuery();
        
        rs.next();
        List<Usuario> listUsuarios = new ArrayList<Usuario>();
        
        while (rs.next()){
            Usuario user = new Usuario();
            Endereco end = new Endereco();
            user.setId(rs.getString("id"));
            user.setNome(rs.getString("nome"));
            user.setCpf(rs.getString("cpf"));
            user.setRg(rs.getString("rg"));
            user.setSexo(rs.getString("sexo"));
            end.setLogradouro(rs.getString("logradouro"));
            end.setBairro(rs.getString("bairro"));
            
            user.setEndereco(end);
            listUsuarios.add(user);   
        }
        return listUsuarios;
    }
    public boolean delete(Usuario user) throws ClassNotFoundException{ 
        con = new ConnectionJDBC().getConnection();
        try{  
            psUsuario = con.prepareStatement("delete from usuario where id=?"); 
            psUsuario.setString(1, user.getId());  
            psUsuario.execute(); 
            psUsuario.close();
            return true;
        }catch(SQLException e){  
            e.printStackTrace();
            return false;
        }  
    }
    
    //alterar

}


