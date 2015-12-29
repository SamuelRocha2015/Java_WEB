/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.util;

/**
 *
 * @author Samuel
 */
public class SQL {

    public static final String INSERE_CONTATO = "INSERT INTO CONTATO (NOME, EMAIl, ENDERECO, DATA_NASCIMENTO) VALUES (?, ?, ?, ?) ";
    public static final String REMOVE_CONTATO = "DELETE FROM CONTATO WHERE CONTATO_ID = ?";
    public static final String CONSULTA_CONTATO_POR_ID = "SELECT CONTATO_ID, NOME, EMAIl, ENDERECO, DATA_NASCIMENTO FROM CONTATO WHERE CONTATO_ID = ?";
    public static final String CONSULTA_CONTATO_POR_NOME = "SELECT CONTATO_ID, NOME, EMAIl, ENDERECO, DATA_NASCIMENTO FROM CONTATO WHERE NOME LIKE ?";
    public static final String CONSULTA_TODOS_CONTATOS = "SELECT CONTATO_ID, NOME, EMAIl, ENDERECO, DATA_NASCIMENTO FROM CONTATO";
    
}
