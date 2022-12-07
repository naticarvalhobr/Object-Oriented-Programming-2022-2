<%-- 
    Document   : deleteUsuario
    Created on : 1 de dez. de 2022, 09:50:20
    Author     : natic
--%>

<%@page import="model.persistence.Usuario"%>
<%@page import="controller.UsuarioController"%>
<%@page import="view.FormUsuario"%>

<%
    Usuario user = new Usuario();
    UsuarioController userController = new UsuarioController();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deleting</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="cadastro.css">
        <link rel="stylesheet" href="footer.css">
        <link rel="stylesheet" href="home.css">
    </head>
    
    <body>
       <style>
            body{
                background-image: url(whiteBackground.png);
                margin-left: 20%;
                margin-right: 20%;}
        </style>
    
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>   

<%  
    user.setId(request.getParameter("id")) ;
    if(userController.delete(user)){%>
        <h3 style='color:#917243;font-weight:bold;font-family:Montserrat;text-align:center;margin-top:50px;margin-bottom:40px'>Deleted successfully!</h3>
    <%}else{%>
        <h3 style='color:#917243;font-weight:bold;font-family:Montserrat;text-align:center;margin-top:50px;margin-bottom:40px'>Couldn't delete it!</h3>
    <%}%>
    
    <a style='color:#917243;font-weight:bold;font-family:Montserrat;text-align:center;margin-left:370px;font-size:18px;' href="index.jsp">Return</a>
    
    </body>     
</html>