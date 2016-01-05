package br.com.agenda.DAOImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.agenda.DAO.ContatoDAO;
import br.com.agenda.beans.Contato;
import br.com.agenda.util.ConnectionFactory;
import br.com.agenda.util.SQL;
import br.com.agenda.util.Util;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

public class ContatoDAOImpl implements ContatoDAO {

    private Connection con;
    private final Util util = new Util();

    public ContatoDAOImpl() {
        this.con = new ConnectionFactory().getConnection();
    }

    @Override
    public Contato busca(Integer idContato) {
        Contato contato = new Contato();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(SQL.CONSULTA_CONTATO_POR_ID);    
            stmt.setInt(1, idContato);
            
            // executa um select
           rs = stmt.executeQuery();
            
            if (rs.next()) {
                contato.setContatoId(rs.getInt("contato_id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setEndereco(rs.getString("endereco"));
                        
                // montando a data através do Calendar
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("data_nascimento"));
                contato.setDataNascimento(data);
            }

        } catch (SQLException e) {
            util.trataErro(util.MSG_ERRO_DAO_0001, e);
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return contato;
    }

    @Override
    public List<Contato> buscaTodos() {
        List<Contato> contatos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt =  con.prepareStatement(SQL.CONSULTA_TODOS_CONTATOS);    
            
            // executa um select
            rs = stmt.executeQuery();

            // itera no ResultSet
            while (rs.next()) {
                Contato contato = new Contato();
                contato.setContatoId(rs.getInt("contato_id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setEndereco(rs.getString("endereco"));
                        
                // montando a data através do Calendar
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("data_nascimento"));
                contato.setDataNascimento(data);

                contatos.add(contato);
            }

        } catch (SQLException e) {
            util.trataErro(util.MSG_ERRO_DAO_0002, e);
        } finally{
            util.fechaConexao(con, stmt, rs);
        }
        
        return contatos;
    }

    @Override
    public void insere(Contato contato) {
        PreparedStatement stmt = null;
        try {
            // prepared statement para insert into
            stmt = con.prepareStatement(SQL.INSERE_CONTATO);

            // seta os valores
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

            // executa
            stmt.execute();

        } catch (SQLException e) {
            util.trataErro(util.MSG_ERRO_DAO_0003, e);
        } finally {
            //fecha as conexoes
            util.fechaConexao(con, stmt, null);
        }

    }

    @Override
    public void remove(Integer idContato) {
        PreparedStatement stmt = null;
        try {
            
           stmt = con.prepareStatement(SQL.REMOVE_CONTATO);
               
            stmt.setInt(1, idContato);
            
            stmt.execute();
       
            
        } catch (SQLException e) {
            util.trataErro(util.MSG_ERRO_DAO_0004, e);
        } finally{
            util.fechaConexao(con, stmt, null);
        }

    }

}
