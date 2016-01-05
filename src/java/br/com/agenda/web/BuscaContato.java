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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Samuel
 * Implementação 01 - Busca todos os contatos do banco de dados e exibie na pagina
 */
//@WebServlet("/busca")
//public class BuscaContato extends HttpServlet{
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ContatoDAOImpl dao = new ContatoDAOImpl();
//        List<Contato> contatos = dao.buscaTodos();
//        
//        PrintWriter writer = resp.getWriter();
//        writer.println("<html><body>");
//        writer.println("Resultado da Busca : </br>");
//        
//        writer.println("<ul>");
//        for (Contato contato : contatos) {
//            writer.println("<li>" + contato.getNome() + "</li>" );
//        }
//        writer.println("</ul>");
//        
//        writer.println("</body></html>");
//    }
//    
//    
//}



/**
 * 
 * @author Samuel
 * Implementação 02 - Busca o contato de acordo com o id passado como parametro na URI
 */
//@WebServlet("/busca")
//public class BuscaContato extends HttpServlet{
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ContatoDAOImpl dao = new ContatoDAOImpl();
//        
//        //recupera o parametro informado na URI
//        String idContato = req.getParameter("id");
//        Contato contato = dao.busca(Integer.valueOf(idContato));
//        
//        PrintWriter writer = resp.getWriter();
//        writer.println("<html><body>");
//        writer.println("Resultado da Busca : </br>");
//        writer.println("<ul>");
//        writer.println("<li>" + contato.getNome() + "</li>");
//        writer.println("</ul>");
//        writer.println("</body></html>");
//    }
//    
//}


/**
 * 
 * @author Samuel
 * Exercicio 01 - Crie uma implementação inteligente a ponto de verificar se o usuario passou algum ID na URI ou não
 * caso não tenha passado nenhum deve retornar todos os contatos, caso contrario deve retornar apenas aquele que 
 * corresponde ao id passado no parametro
 */
@WebServlet("/busca")
public class BuscaContato extends HttpServlet{

    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ContatoDAOImpl dao = new ContatoDAOImpl();
        List<Contato> contatos = new ArrayList<>();
        Contato contato = null;
        //recupera o parametro informado na URI
        String idContato = req.getParameter("id");
        if ( idContato != null &&  idContato != "") {
            contato = dao.busca(Integer.valueOf(idContato));
            contatos.add(contato);
        } else {
            contatos = dao.buscaTodos();
        }
        
        req.setAttribute("contatos", contatos);
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/buscaContato.jsp");
        dispatcher.forward(req, resp);
        
    }
    
}
