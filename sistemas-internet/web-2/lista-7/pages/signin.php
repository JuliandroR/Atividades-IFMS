<!DOCTYPE html>
<html lang="pt">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Criar novo usuário</title>
</head>

<body>
    <?php
    require_once("../components/header.php");
    // session_start();
    // echo var_dump($_SESSION["users"]);
    ?>
    <main class="d-flex align-items-center min-vh-100 py-3 py-md-0">
        <div class="container justify-content-center align-items-center">
            <div class="card login-card">
                <div class="row no-gutters">
                    <div class="col-md-5">
                        <img src="https://images.pexels.com/photos/4260477/pexels-photo-4260477.jpeg?auto=compress" alt="login" class="login-card-img">
                    </div>
                    <div class="col-md-7">
                        <div class="card-body">
                            <p class="login-card-description">Crie sua conta</p>
                            <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
                                <div class="form-group">
                                    <label for="name" class="sr-only">Digite seu nome</label>
                                    <input type="text" name="name" id="name" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="color" class="sr-only">Selecione uma cor</label>
                                    <input type="color" name="color" id="color" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="email" class="sr-only">Digite seu e-mail</label>
                                    <input type="email" name="email" id="email" class="form-control" placeholder="Email address">
                                </div>
                                <div class="form-group mb-4">
                                    <label for="password" class="sr-only">Digite sua senha</label>
                                    <input type="password" name="password" id="password" class="form-control" placeholder="***********">
                                </div>
                                <input name="signin" id="signin" class="btn btn-block login-btn mb-4" type="submit" value="Criar usuário">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
</body>
<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST["name"];
    $color = $_POST["color"];
    $email = $_POST["email"];
    $pass = $_POST["password"];

    setcookie("cor", $color, time() + 6000);

    session_start();
    if (isset($_SESSION["users"])) {
        echo  "<script>alert('Já foi setado');</script>";
        $users = $_SESSION["users"];
        array_push($users, array(
            "name" => $name,
            "email" => $email,
            "password" => $pass
        ));

        $_SESSION["users"] = $users;
    } else {
        echo  "<script>alert('Não foi setado');</script>";
        $users = array(array(
            "name" => $name,
            "email" => $email,
            "password" => $pass
        ));
        $_SESSION["users"] = $users;
    }

    header("Location: http://localhost:3000/index.php");
    die();
}
?>

</html>