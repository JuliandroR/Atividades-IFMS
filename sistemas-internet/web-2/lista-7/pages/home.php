<!DOCTYPE html>
<html lang="pt">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial</title>
</head>

<body>
    <?php
    require_once("../components/header.php");
    ?>
    <main class="d-flex align-items-center min-vh-100 py-3 py-md-0">
        <div class="container justify-content-center align-items-center text-center">
            <img src="https://icon-library.com/images/default-profile-icon/default-profile-icon-16.jpg" alt="Default profile photo" class="profile-photo">

            <?php
            session_start();
            $name = $_SESSION["user_logged"]["name"];
            $email = $_SESSION["user_logged"]["email"];
            $color = $_COOKIE["cor"];
            echo <<<EOF
                <blockquote class="blockquote text-center">
                    <p style="color: $color;">$name</p>
                    <footer class="blockquote-footer">$email</footer>
                </blockquote>
            EOF;
            ?>

            <a class="btn btn-primary" href="../index.php" role="button">Sair</a>
        </div>
    </main>
</body>

</html>