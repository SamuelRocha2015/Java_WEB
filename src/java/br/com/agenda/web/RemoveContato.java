/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.web;

import br.com.agenda.DAOImpl.ContatoDAOImpl;
import br.com.agenda.beans.Contato;
import br.com.agenda.util.ConstantesSistema;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Samuel
 */
public class RemoveContato implements Tarefa {
    
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse response) {
        ContatoDAOImpl dao = new ContatoDAOImpl();
        Contato contato = new Contato();
        contato.setNome(req.getParameter("nome"));
        dao.remove(Integer.valueOf(req.getParameter("contatoId")));

        req.setAttribute("contato", contato);
        req.setAttribute("acao", "removido");
        return ConstantesSistema.JSP_SUCESSO;
    }
    
}
