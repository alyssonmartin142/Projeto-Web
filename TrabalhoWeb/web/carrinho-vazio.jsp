<%-- 
    Document   : carrinho-vazio
    Created on : 02/11/2016, 11:43:54
    Author     : Alysson Martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="menu" class="ecommerce.model.Menu"/>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrinho de Compras</title>
        <link rel="stylesheet" href="css/w3.css">
        <link rel="stylesheet" href="css/meu-estilo.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <style>
            a {
                color: white;
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
        
        <div class="w3-content" style="margin-left: 6%; margin-top:46px">
            <h1>Carrinho de Compras!</h1>
            <table class="w3-center" border="1" cellpadding="2" >
                <tr>
                    <td bgcolor="#000000"><font color="white">Remover</font></td>
                    <td bgcolor="#000000"><font color="white">Item</font></td>
                    <td bgcolor="#000000"><font color="white">QTD</font></td>
                    <td bgcolor="#000000"><font color="white">Preço Unitário</font></td>
                    <td bgcolor="#000000"><font color="white">Total Item</font></td>
                    <td bgcolor="#000000"><font color="white">Adicionar</font></td>
                </tr>
                
            </table>
            <strong>Valor Total: 0.00</strong><br/>
            <button class="w3-btn w3-margin-bottom">
                <a style="text-decoration:none" href="ControleCarrinho?acao=finalizarCompra">Finalizar compra</a>
            </button>
            <button class="w3-btn w3-margin-bottom">
                <a style="text-decoration:none" href="produtos.jsp">Continue comprando</a>
            </button>
            <button class="w3-btn w3-margin-bottom">
                <a style="text-decoration:none" href="ControleCarrinho?acao=cancelaCompra">Cancelar comprar</a>
            </button>
        </div>
    </body>
</html>
