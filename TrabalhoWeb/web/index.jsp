<%-- 
    Document   : index
    Created on : 27/10/2016, 21:27:22
    Author     : Alysson Martin
--%>
<jsp:useBean id="menu" class="ecommerce.model.Menu"/> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem vindo!</title>
        <link rel="stylesheet" href="css/estilo.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/w3.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <!-- Navbar -->
        <%
            out.print(menu.MostrarMenu());
        %>

        <!-- Page content -->
        <div class="w3-content" style="max-width:2000px;margin-top:46px">

            <!-- Automatic Slideshow Images -->
            <div class="mySlides w3-display-container w3-center">
                <img src="img/banner_crf_230.jpg" style="width:100%">
                <div class="texto-banner">
                    <h1 class="nome-moto">CRF 230</h1>
                    <h1 class="descricao-moto">
                        FREIO DIANTEIRO A DISCO, PARTIDA ELÉTRICA,<br>
                        SUSPENSÃO TRASEIRA COM LINK.<br>
                        IDEAL PARA TRILHA E LAZER
                    </h1>
                </div>
            </div>
            <div class="mySlides w3-display-container w3-center">
                <img src="img/banner_ttr_230.jpg" style="width:100%">
                <div class="texto-banner">
                    <h1 class="nome-moto">TT-R 230</h1>
                    <h1 class="descricao-moto">
                        FREIO DIANTEIRO A DISCO, PARTIDA ELÉTRICA,<br>
                        SUSPENSÃO TRASEIRA COM LINK.<br>
                        IDEAL PARA TRILHA E LAZER
                    </h1>
                </div>
            </div>
            <div class="mySlides w3-display-container w3-center">
                <img src="img/banner_ktm_450.jpg" style="width:100%">
                <div class="texto-banner">
                    <h1 class="nome-moto">KTM 450 SX-F</h1>
                    <h1 class="descricao-moto">
                        com um design sofisticado mola de ar e <br>
                        separar de amortecimento para fácil ajuste, <br>
                        1,4 kg mais leve
                    </h1>
                </div>
            </div>

            <!-- The Band Section -->
            <div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px" id="band">
                <h2 class="titulo-texto">OFF - Road</h2>
                <p class="texto">Off Road ou Todo-terreno (português europeu) 
                    ou Fora de estrada (português brasileiro) é um termo do vocabulário 
                    inglês que literalmente quer dizer "fora de estrada" e designa atividades 
                    variadas praticadas em locais desprovidos de estradas pavimentadas, calçadas
                    ou de fácil acesso e trâmite. Geralmente os locais preferidos para prática do
                    off road são os mais distantes de cidades e desprovidos de infraestrutura urbana.
                    O contato com a natureza é algo desejado e apreciado e o objetivo desta atividade 
                    é superar as dificuldades de acesso e transposição impostos pela natureza como por 
                    exemplo na forma de lama, pedras, erosões, subidas e descidas íngremes, neve, 
                    alagamentos, etc.
                </p>
                <p class="texto">
                    Atualmente o off road está associado à adrenalina e à velocidade 
                    pois as atividades mais comuns utilizam-se de veículos motorizados
                    como motos, jeeps e camionetes, mas também existem atividades off road
                    praticadas com cavalos, bicicletas e também a pé.
                </p>
                <p class="texto">
                    O Off-Road motorizado que hoje é utilizado como esporte e terapia
                    pelos seus praticantes, nasceu de uma necessidade de guerra. Os primeiros
                    veículos foram criados durante a 2ª Guerra Mundial com o objetivo de penetrar
                    e deslocar tropas e soldados em locais de difícil acesso.
                </p>
                <p class="texto">
                    Atividades off road podem ser praticadas como lazer e também como competições organizadas.
                </p>

                <!-- End Page Content -->
            </div>

            <!-- Footer -->
            <footer class="w3-container w3-center w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge">
                <p class="w3-medium">Powered by <a href="/TrabalhoWeb/index.jsp" target="_blank">E-Commerce</a></p>
            </footer>

            <script>
                // Automatic Slideshow - change image every 4 seconds
                var meuIndex = 0;
                carousel();

                function carousel() {
                    var i;
                    var x = document.getElementsByClassName("mySlides");
                    for (i = 0; i < x.length; i++) {
                        x[i].style.display = "none";
                    }
                    meuIndex++;
                    if (meuIndex > x.length) {
                        meuIndex = 1
                    }
                    x[meuIndex - 1].style.display = "block";
                    setTimeout(carousel, 8000);
                }

                // Used to toggle the menu on small screens when clicking on the menu button
                function myFunction() {
                    var x = document.getElementById("navDemo");
                    if (x.className.indexOf("w3-show") == -1) {
                        x.className += " w3-show";
                    } else {
                        x.className = x.className.replace(" w3-show", "");
                    }
                }

                // When the user clicks anywhere outside of the modal, close it
                var modal = document.getElementById('ticketModal');
                window.onclick = function (event) {
                    if (event.target == modal) {
                        modal.style.display = "none";
                    }
                }
            </script>
    </body>
</html>
