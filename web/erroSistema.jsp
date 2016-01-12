<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Erro Sistema | Agenda Virtual</title>
        <meta charset="UTF-8">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </head>
    <body>
        <c:import url="menu.jsp" />

        <div class="row col-md-8 col-md-offset-2 custyle text-center">
            <img src="img/erro.png" width="40" height="40" alt="erro no sistema" />

            <h3>Erro no Sistema!</h3>
            <br />
            O Seguinte Erro ocorreu na Aplicação: ${erroSistema}! <br />
            Por Favor, tente novamente dentro de alguns instantes.
        </div>

    </body>
</html>
