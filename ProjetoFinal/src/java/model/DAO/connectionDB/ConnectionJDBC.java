package model.DAO.connectionDB;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionJDBC {

    String usuario = "root";
    String senha = "";
    String url = "jdbc:mysql://localhost:3306/db_java";
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection con = null;

    public Connection getConnection() throws ClassNotFoundException {

        try {
            if (con == null) {
                Class.forName(driver);
                con = (Connection) DriverManager.getConnection(url, usuario, senha);
                System.out.println("Conexão ativa");
            } else if (con.isClosed()) {
                con = null;
                //return getConnection(); 
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        } catch (SQLException e) {
             e.printStackTrace();
             e.getMessage();
        }
        return con;
    }

    public boolean closeConnection() throws SQLException {
        if (con != null) {
            con.close();
        }
        return false;
    }

}
