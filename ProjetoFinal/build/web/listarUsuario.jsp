<%-- 
    Document   : listarUsuario
    Created on : 1 de dez. de 2022, 09:46:51
    Author     : natic
--%>

<%@page import="java.util.List"%>
<%@page import="model.persistence.Usuario"%>
<%@page import="controller.UsuarioController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    UsuarioController userController = new UsuarioController();
    List<Usuario> listaUsuarios = userController.listar();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
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

        <h3 style='color:#917243;font-weight:bold;font-family:Montserrat;text-align:center;margin-top:50px;margin-bottom:40px'>Clients List</h3>
        
       <table class="table">
          <thead class="thead-light">
            <tr>
              <th scope="col" style='color:#393F28'>Name</th>
              <th scope="col" style='color:#393F28'>CPF</th>
              <th scope="col" style='color:#393F28'>RG</th>
              <th scope="col" style='color:#393F28'>Gender</th>
              <th scope="col"></th>
              <th scope="col"></th>
             

            </tr>
          </thead>
          <tbody>
             <% for(Usuario user: listaUsuarios) {%>
            <tr>
            
              <td><% out.println(user.getNome());%></td>
              <td><%out.println(user.getCpf());%></td>
              <td><%out.println(user.getRg());%></td>
              <td><%out.println(user.getSexo());%></td>
              <td><% out.println(user.getEndereco().getLogradouro());%></td>
              <td><a href="deleteUsuario.jsp?id=<% out.println(user.getId());%>"><span style='font-size:18px;'>&#10060;</span></a></i><td>
              <td><span style='font-size:18px;'>&#9997;</span></i><td>

            </tr>
            <tr>
             <%}%>
            </tr>
          </tbody>
        </table>
        
          <a style='color:#917243;font-weight:bold;font-family:Montserrat;text-align:center;margin-left:350px;font-size:18px;' href="index.jsp">Return</a>
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>   
    </body>
</html>