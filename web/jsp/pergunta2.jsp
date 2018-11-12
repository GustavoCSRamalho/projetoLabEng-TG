<!DOCTYPE html>

<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="../CSS/bootstrap.css">
        <link rel="stylesheet" href="../CSS/meuEstilo.css">
        <script src="../JS/bootstrap.js"></script>
        <script src="../JS/meujava.js"></script>
        <script src="../JS/jquery3.1.1.js"></script>

        <title>Perguntas</title>
    </head>

    <body>
        <header>
            <nav class="navbar navbar-expand-lg bg-dark">
                <a class="navbar-brand" href="/" style="color: white">Nome do site</a>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link " href="/sobre" style="color:white">Sobre o site</a>
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
            <p>2) Qual das opções lhe apresenta maior dificuldade?</p>
            <form>
                <div class="checkbox">
                  <label><input type="checkbox" value="">Exatas</label>
                </div>
                <div class="checkbox">
                  <label><input type="checkbox" value="">Raciocinio Logico</label>
                </div>
                <div class="checkbox disabled">
                  <label><input type="checkbox" value="" disabled>Analises e procedimentos</label>
                </div>
                <div class="checkbox disabled">
                    <label><input type="checkbox" value="" disabled>Algoritimos</label>
                </div>
              </form>

                <a href="/pergunta3">
                    <button class="botao mt-5" type="submit">Proximo</button>
                </a>
              
                <a href="/pergunta" class="botao mt-5 ml-5">
                    Voltar
                </a>

                


        </div>

    </body>

</html>