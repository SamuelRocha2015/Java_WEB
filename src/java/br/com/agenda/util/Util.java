package br.com.agenda.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Samuel
 */
public class Util {

    public static final String MSG_ERRO_DAO_0001 = " 001 - ERRO -  Erro: ";
    public static final String MSG_ERRO_CONNECTION_0001 = " 001 - Problema ao tentar criar uma nova Conexão -  Erro: ";
    public static final String MSG_ERRO_CONNECTION_0002 = " 002 - Problema ao para encontrar a Classe -  Erro: ";
    public static final String MSG_ERRO_CONNECTION_0003 = " 001 - Problema ao tentar criar uma nova Conexão -  Erro: ";

    public void fechaConexao(Connection con, PreparedStatement stmt, ResultSet rs) {
        try {

            if (con != null) {
                con.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void trataErro(String mensagem, Exception ex) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	System.err.println(dateFormat.format(System.currentTimeMillis()) + mensagem + ex.toString());
    }

}
