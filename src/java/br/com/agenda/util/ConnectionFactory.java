package br.com.agenda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String url = "jdbc:mysql://localhost/agenda";
    private static final String user = "root";
    private static final String pass = "";

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.err.println("Não foi possivel estabelecer a Conexão!");
        }

        return con;
    }
}
