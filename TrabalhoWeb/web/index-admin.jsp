<%-- 
    Document   : index
    Created on : 27/10/2016, 20:29:16
    Author     : Alysson Martin
--%>
<%@page import="java.util.List"%>
<%@page import="ecommerce.model.Produto"%>
<%@page import="ecommerce.control.ProdutoDAO"%>
<jsp:useBean id="menu" class="ecommerce.model.Menu"/> 
<%@ page import="ecommerce.control.LoginController" %>

<% if (LoginController.estaLogado(request)) { %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem vindo - Admin!</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/w3.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <style>
            a {
                color: black;
            }
            table, td, th {
                border: 1px solid black;
            }

            table {
                border-collapse: collapse;
                width: 70%;
            }

            td {
                height: 30px;
                vertical-align: bottom;
            }
        </style>
    </head>
    <body>
        <!-- Navbar -->
        <%
            out.print(menu.MostrarMenu());
        %>
        
        <div class="w3-content " style="max-width:2000px;margin-top:46px">
            <h1 class="w3-center texto-banner">Produtos cadastrados!</h1>
            <div class="container">
                <table class="w3-center" style="margin-left: 10%">
                    <tr>
                        <th bgcolor="#000000"><font color="white">Codigo</th>
                        <th bgcolor="#000000"><font color="white">Produto</th>
                        <th bgcolor="#000000"><font color="white">Descrição</th>
                        <th bgcolor="#000000"><font color="white">Valor Unitario</th>
                        <th bgcolor="#000000"><font color="white">Editar</th>
                        <th bgcolor="#000000"><font color="white">Excluir</th>
                    </tr>
                    <%
                        List<Produto> produtos = ProdutoDAO.MostrarProdutos();
                        for (int i = 0; i < produtos.size(); i++) {
                    %>
                    <tr>
                        <td><%out.print(produtos.get(i).getId());%></td>
                        <td><% out.print(produtos.get(i).getNome());%></td>
                        <td><% out.print(produtos.get(i).getDescricao());%></td>
                        <td><% out.print(produtos.get(i).getPrecoUnitario());%></td>
                        <td><a style="text-decoration:none" href="AlterarProduto?acao=alterar&idProduto=<%=produtos.get(i).getId()%>">
                                <span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a></td>
                        <td><a style="text-decoration:none" href="ControleAdmin?acao=excluir&idProduto=<%=produtos.get(i).getId()%>">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>
                    </tr>
                    <%}%>
                </table>
            </div>
        </div>
    </body>
</html>
<% } else {
        response.sendRedirect("/TrabalhoWeb/login.jsp");
    }
%>