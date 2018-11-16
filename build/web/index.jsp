<!DOCTYPE html>

<!--PAGINA OFICIAL PARA FAZER LOGIN-->
    <html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="../css/bootstrap.css">
        <link rel="stylesheet" href="../css/meuEstilo.css">
        <script src="../js/bootstrap.js"></script>
        <script src="../js/meuJava.js"></script>
        <script src="../js/jquery3.1.1.js"></script>

        <title>Login</title>

    </head>

    <body>
        <header>
            <nav class="navbar navbar-expand-lg bg-dark">
                <a class="navbar-brand" href="/" style="color: white">Nome do site</a>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link" href="/sobre" style="color:white">Sobre o site</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>

        <div class="container">


            <form class="col-md-6 offset-md-3 jumbotron mt-5" action="/index" method="GET">
                <h3 class="mb-5">Login</h3>
                
                <div class="form-group">
                    <!-- Nome de usuario-->
                    <label>Usuario:</label>
                    <input type="text" class="form-control" name="usuario" placeholder="Entre com seu Nome de usuario">
                </div>

                <div class="form-group">
                    <!-- senha-->
                    <label>Senha:</label>
                    <input type="password" class="form-control" name="senha" placeholder="Entre com sua senha">
                </div>
                <span id="erro" class="text text-danger"></span>
               
                <p class="text-center">Nao possui uma conta, então
                    <a id="novologin" href="/Cadastro">Cadastre-se!</a>
                </p>

                <center>
                    <button class="botao mt-3" type="submit" onclik ="vazio()">Acessar</button>
                </center>
            </form>
        </div>
    </body>
</html>