/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.teste;

import br.com.agenda.util.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author Samuel
 */
public class TestaConexao {
    
    public static void main(String[] args) {
        try {
            Connection con = new ConnectionFactory().getConnection();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}
