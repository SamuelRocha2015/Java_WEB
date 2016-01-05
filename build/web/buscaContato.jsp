<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busca Contato</title>
    </head>
    <body>
        Resultado da busca:
        <ul>
            <c:forEach var="contato" items="${contatos}">
                <li>${contato.nome}</li>
            </c:forEach>
        </ul>
    </body>
</html>
