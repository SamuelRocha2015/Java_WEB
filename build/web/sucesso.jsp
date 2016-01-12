<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Sucesso | Agenda Virtual</title>
        <meta charset="UTF-8">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </head>
    <body>
        <c:import url="menu.jsp" />

        <div class="row col-md-8 col-md-offset-2 custyle text-center">
            <img src="img/sucesso.png" width="40" height="40" alt="sucesso" />

            <h3>Parabéns!</h3>
            <br />
             Contato ${contato.nome} ${acao} com sucesso! <br />
        </div>

    </body>
</html>