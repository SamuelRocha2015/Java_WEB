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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

public class ContatoDAOImpl implements ContatoDAO {

    private Connection con;

    public ContatoDAOImpl() {
        this.con = new ConnectionFactory().getConnection();
    }

    @Override
    public Contato busca(Integer idContato) {
        Contato contato = new Contato();
        try {
            PreparedStatement stmt = con.prepareStatement(SQL.CONSULTA_CONTATO_POR_ID);    
            stmt.setInt(1, idContato);
            
            // executa um select
            ResultSet rs = stmt.executeQuery();
            
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

            rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contato;
    }

    @Override
    public List<Contato> buscaTodos() {
        List<Contato> contatos = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(SQL.CONSULTA_TODOS_CONTATOS);    
            
            // executa um select
            ResultSet rs = stmt.executeQuery();

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

            rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return contatos;
    }

    @Override
    public void insere(Contato contato) {
        try {
            // prepared statement para insert into
            PreparedStatement stmt = con.prepareStatement(SQL.INSERE_CONTATO);

            // seta os valores
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

            // executa e fecha
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void remove(Integer idContato) {
        try {
            
            PreparedStatement stmt = con.prepareStatement(SQL.REMOVE_CONTATO);
               
            stmt.setInt(1, idContato);
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
