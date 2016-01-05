<%@page import="java.util.List"%>
<%@page import="br.com.agenda.beans.Contato"%>
<%@page import="br.com.agenda.web.BuscaContato"%>


<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Resultado da busca: 
        <ul>
            <%
                List<Contato> contatos = (List<Contato>) request.getAttribute("contatos");
                for (Contato contato : contatos) {
            %>
            <li>
                <%out.println(contato.getNome());%>
            </li>
            <%
                }
            %>
        </ul>
    </body>
</html>
