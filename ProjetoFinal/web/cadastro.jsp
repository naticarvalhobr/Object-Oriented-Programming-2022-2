<%-- 
    Document   : cadastro.jsp
    Created on : 24 de nov. de 2022, 11:10:51
    Author     : natic
--%>

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
        <link rel="stylesheet" href="cadastro.css">
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
                <li class="nav-item" >
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
        
        <img src="Resources/CabeçalhoHeaderSignUp.png" alt="" width="100%" height="95">
        <div id="filhaHome6">
            <form name="DadosUsuario" action="salvarUsuario.jsp" methodo="get" >
                <!-- Email input -->
                <img src="Resources/PersonalData.png" alt="" width="100%" height="60">

                <div class="form-outline mb-3">
                    <label class="form-label" for="name">Name</label>
                    <input name="nome" type="input" id="name" class="form-control" />
                    <label class="form-label" for="form1Example1">CPF</label>
                    <input name="cpf" type="cpf" id="cpf" class="form-control" />
                    <label class="form-label" for="form1Example1">RG</label>
                    <input name="rg" type="rg" id="rg" class="form-control" />
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="sexo" id="f" value="F">
                    Female <br/>
                    <input class="form-check-input" type="radio" name="sexo" id="m" value="M">
                    Male
                </div>
                <img src="Resources/Address.png" alt="" width="100%" height="60">
                <div class="form-outline mb-3">
                    <label class="form-label" for="logradouro">Address</label>
                    <input name="logradouro" type="input" id="logradouro" class="form-control" />
                    <label class="form-label" for="cep">CEP</label>
                    <input name="cep" type="input" id="cep" class="form-control" />
                    <label class="form-label" for="cep">Neighbourhood</label>
                    <input name="bairro" type="input" id="bairro" class="form-control" />
                    <label for="inputState">State</label>
                    <select name="uf" id="inputState" class="form-control">
                        <option value="DF">DF</option>
                        <option value="MG">MG</option>
                    </select>
                    <label class="form-label" for="cep">Country</label>
                    <input name="pais" type="input" id="pais" class="form-control" />
                </div>
                <!-- Submit button -->
                <center>
                    <button type="submit" onclick="submit()" class="btn1 btn1-primary btn1-block" style="margin-left:30px">Salvar</button>
            </form>
        </div>
    </body>
</html>
