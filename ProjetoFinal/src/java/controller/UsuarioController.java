package controller;

import java.sql.SQLException;
import java.util.List;
import model.DAO.UsuarioDAO;
import model.persistence.Endereco;
import model.persistence.Usuario;
import view.FormUsuario;

public class UsuarioController {

	public boolean cadastrar(FormUsuario user) throws ClassNotFoundException {
            
            Usuario usuario = new Usuario();
            usuario.setNome(user.nome);
            usuario.setCpf(user.cpf);
            usuario.setSexo(user.sexo);
            usuario.setRg(user.rg);
            
                    
            Endereco end = new Endereco();
            end.setLogradouro(user.logradouro);
            end.setBairro(user.bairro);
            end.setPais(user.pais);
            end.setUf(user.uf);
            end.setCep(user.cep);
            
            usuario.setEndereco(end);
            
            UsuarioDAO userDAO = new UsuarioDAO();
            
            
            return userDAO.salvar(usuario);
          
        }
        
        public List<Usuario> listar() throws SQLException, ClassNotFoundException{
            UsuarioDAO userDAO = new UsuarioDAO();
            List<Usuario> listaUsuarios = userDAO.listar();
            return listaUsuarios;
        }
        
        
        public boolean delete(Usuario user) throws ClassNotFoundException{
           
             UsuarioDAO userDAO = new UsuarioDAO();
             if(userDAO.delete(user)){
                 return true;
             }else{
                 return false;
             }   
        }
}
