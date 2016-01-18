<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busca Contato</title>


        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <script type="text/javascript">
            function removeContato(id, nome) {
                
                var opcao = confirm('Deseja Realmente excluir este contato?');
                if (opcao) {
                     
                    alert(id + " - " + nome);
                    
//                    location.href='/executa/RemoveContato';
                } 
            }
        </script>

    </head>
    <body>
        <c:import url="menu.jsp" />
        <div class="container">
            <h2>Contatos</h2>
            <hr>
            <div class="row col-md-11 col-md-offset-1 custyle">
                <table class="table table-striped custab">
                    <thead>
                        <tr>
                            <th>Código</th>
                            <th>Nome</th>
                            <th>Email</th>
                            <th>Data Nascimeto</th>
                            <th> Ação</th>

                        </tr>
                    </thead>
                    

                        <c:forEach var="contato" items="${contatos}">
                            <tr>
                                <td>${contato.contatoId}</td>
                                <td>${contato.nome}</td>
                                <td>${contato.email}</td>
                                <td>${contato.dataNascimento.time}</td>
                                <!--<td> <img src="img/edit.png" width="20" height="20" alt="edit" onclick="removeContato()"/></td>-->
                                <td> <img src="img/delete.png" width="20" height="20" alt="delete" 
                                          onclick="removeContato(${contato.contatoId}, ${contato.nome})"/></td>
                            </tr>
                        </c:forEach>
                </table>
            </div>
        </div>    
    </body>
</html>
