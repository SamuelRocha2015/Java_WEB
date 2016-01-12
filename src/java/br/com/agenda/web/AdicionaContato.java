/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.web;

import br.com.agenda.DAOImpl.ContatoDAOImpl;
import br.com.agenda.beans.Contato;
import br.com.agenda.util.ConstantesSistema;
import br.com.agenda.util.Util;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Samuel
 */
public class AdicionaContato implements Tarefa {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse response) {
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
            util.trataErro(ConstantesSistema.MSG_ERRO_WEB_0001, ex);
        }

        dao.insere(contato);

        req.setAttribute("contato", contato);
        req.setAttribute("acao", "registrado");
        return ConstantesSistema.JSP_SUCESSO;
    }

}
