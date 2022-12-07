<%-- 
    Document   : cadastro.jsp
    Created on : 24 de nov. de 2022, 11:10:51
    Author     : natic
--%>

<%@page import="view.FormUsuario"%>
<%@page import="controller.UsuarioController"%>
<%@page import="model.DAO.connectionDB.ConnectionJDBC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Coffee Inc.</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="footer.css">
        <link rel="stylesheet" href="home.css">

    </head>
    <body>
        
    <nav class="navbar navbar-expand-lg">
      <div class="container-fluid">
        <a class="navbar-brand"  href="index.jsp">
          <img src="Resources/BrandIcon.png" alt="" width="175" height="112">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item"> 
              <a class="nav-link active"  aria-current="page" href="index.jsp">Home</a>
            </li>
            <li class="nav-item" >
              <a class="nav-link " href="cadastro.jsp">Sign Up</a>
            </li>
            <li class="nav-item" >
              <a class="nav-link " href="listarUsuario.jsp">Data</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
<!-- Imagem de inicio -->

  <img src="Resources/Inicio.png" alt="" width="100%" height="900">

<!-- Imagem de inicio -->

 <!-- Parte do texto lado direito -->
 <div class="paiHome">

  <div id="filhaHome1">

      <div id="filhaHome5">
        <p>About your coffee</p>
      </div>

      <p>Our coffee is optimized to ensure it is delivered fresh! All drinks are newly prepared! Our main beans are Catuaí coffee and Robusta coffee.</p>

      <p class="btn" role="button">Learn More</p>

  </div>
  <div id="filhaHome2">
      <img src="Resources/Coffee.png" alt="" width="500" height="500">

  </div>
</div>

<!-- Parte do lado direita-->


<!-- Imagem de inicio -->
<img src="Resources/Carrosel.png" alt="" width="100%" height="900">
<!-- Imagem de inicio -->


<!-- Parte do mapa -->
<div class="paiHome2">
  <div id="filhaHome3">  
      <p>Find the nearest store</p>
      <a class="btn" href="https://www.google.com.br/maps" role="button">Here</a>
  </div>
  <div id="filhaHome4">
      <img src="Resources/Map.png" alt="" width="550" height="350" >
  </div>
</div>
<!-- Parte do mapa -->

    <footer>

        <div class="paiFooter">

            <div id="filhaFooter3">

              <img src="Resources/instagramIcon.png" height="50px" width="50px">
              <img src="Resources/linkedinIcon.png" height="50px" width="50px">
              <img src="Resources/youtubeIcon.png" height="50px" width="60px">
            </div>
        </div>

    </footer>
   

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>        
    </body>
</html>
