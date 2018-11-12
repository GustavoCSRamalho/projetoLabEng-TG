<!DOCTYPE html>

<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="../css/bootstrap.css">
        <link rel="stylesheet" href="../css/meuEstilo.css">
        <script src="../js/bootstrap.js"></script>
        <script src="../js/meujava.js"></script>
        <script src="../js/jquery3.1.1.js"></script>

        <title>Perguntas</title>
    </head>

    <body>
        <header>
            <nav class="navbar navbar-expand-lg bg-dark">
                <a class="navbar-brand" href="Index.html" style="color: white">Nome do site</a>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link " href="sobre.html" style="color:white">Sobre o site</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>

        <div class="container-fluid">
            <h1 class="text-center mb-5">Aqui começa as perguntas que estarão no site</h1>
        </div>

        <div class="container">
            <h3>Perguntas</h3>
            <p>1) Qual a media das suas faltas em porcentagem?</p>
            <form action="/Pergunta" method="GET">
                <div class="checkbox">
                  <label><input type="checkbox" value="">10%</label>
                </div>
                <div class="checkbox">
                  <label><input type="checkbox" value="">20%</label>
                </div>
                <div class="checkbox disabled">
                  <label><input type="checkbox" value="" disabled>50%</label>
                </div>
                <div class="checkbox disabled">
                    <label><input type="checkbox" value="" disabled>Mais de 50%</label>
                </div>
              </form>

                <a href="/pergunta2" > 
                    <button class="botao mt-5 " href="pergunta2" type="submit">Proximo</button>
                </a>
        </div>

    </body>

</html>