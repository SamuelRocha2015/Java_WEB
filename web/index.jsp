<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Grava Contato | Agenda Virtual</title>
        <meta charset="UTF-8">


        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </head>
    <body>
        <c:import url="menu.jsp" />
        
        <div class="container">
            <h2>Novo Contato</h2>
            <hr>
            <form action="executa" method="POST" class="form-horizontal" role="form">
                <input type="hidden" name="tarefa" value="AdicionaContato"> 
                
                <div class="form-group">
                    <label class="  col-md-1" for="nome">Nome:</label>
                    <div class="col-md-4">
                        <input type="text" class="form-control" id="nome" name="nome"  placeholder="Nome do Contato">
                    </div>
                </div>

                <div class="form-group">
                    <label class="  col-md-1" for="nome">E-mail:</label>
                    <div class="col-md-4">
                        <input type="email" class="form-control" id="email" name="email" placeholder="Email do Contato">
                    </div>
                </div>

                <div class="form-group">
                    <label class="  col-md-1" for="nome">Endereço:</label>
                    <div class="col-md-4">
                        <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Endreço do Contato">
                    </div>
                </div>


                <div class="form-group">
                    <label class="  col-md-1" for="nome">Nascimento:</label>
                    <div class="col-md-4">
                        <input type="text" class="form-control" id="dataNascimento" name="dataNascimento" placeholder="dd/mm/aaaa">
                    </div>
                </div>

                <input type="submit" value="Gravar" class="btn btn-primary" />
                <input type="reset" value="Limpar" class="btn btn-danger" />

            </form>
        </div>
        
    </body>
</html>
