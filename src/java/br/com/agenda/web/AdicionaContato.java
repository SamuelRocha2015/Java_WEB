/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.web;

import br.com.agenda.DAOImpl.ContatoDAOImpl;
import br.com.agenda.beans.Contato;
import br.com.agenda.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Samuel
 */
@WebServlet("/adicionaContato")
public class AdicionaContato extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ContatoDAOImpl dao = new ContatoDAOImpl();
        Contato contato = new Contato();
        contato.setNome(req.getParameter("nome"));
        contato.setEmail(req.getParameter("email"));
        contato.setEndereco(req.getParameter("endereco"));
        Util util = new Util();

        String dtNascimento = req.getParameter("dataNascimento");
        Calendar dataNascimento = null;

        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dtNascimento);
            dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(date);
            contato.setDataNascimento(dataNascimento);
        } catch (ParseException ex) {
            util.trataErro(util.MSG_ERRO_WEB_0001, ex);
        }
        
        dao.insere(contato);
        
        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("Contato " + contato.getNome() + " Cadastrado com sucesso! </br>");
        writer.println("</body></html>");
        
    }

}