package br.com.agenda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String url = "jdbc:mysql://localhost/agenda";  
    private static final String user = "root";
    private static final String pass = "";
    private final Util util = new Util();

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            util.trataErro(util.MSG_ERRO_CONNECTION_0001, e);
        } catch (Exception e ){
            util.trataErro(util.MSG_ERRO_CONNECTION_0002, e);
        }
        
        return con;
    }
}
