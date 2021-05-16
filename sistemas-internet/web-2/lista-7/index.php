<!DOCTYPE html>
<html lang="pt">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>

<body>
    <?php
    require_once("./components/header.php");
    ?>
    <main class="d-flex align-items-center min-vh-100 py-3 py-md-0">
        <div class="container justify-content-center align-items-center">
            <div class="card login-card">
                <div class="row no-gutters">
                    <div class="col-md-5">
                        <img src="https://images.pexels.com/photos/7440541/pexels-photo-7440541.jpeg?auto=compress" alt="login" class="login-card-img">
                    </div>
                    <div class="col-md-7">
                        <div class="card-body">
                            <p class="login-card-description">Faça login</p>
                            <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
                                <div class="form-group">
                                    <label for="email" class="sr-only">Digite seu e-mail</label>
                                    <input type="email" name="email" id="email" class="form-control" placeholder="Email address">
                                </div>
                                <div class="form-group mb-4">
                                    <label for="password" class="sr-only">Digite sua senha</label>
                                    <input type="password" name="password" id="password" class="form-control" placeholder="***********">
                                </div>
                                <input name="login" id="login" class="btn btn-block login-btn mb-4" type="submit" value="Login">
                            </form>
                            <p class="login-card-footer-text"> Ainda não possui acesso? <a href="./pages/signin.php" class="text-reset">Clique aqui</a> e crie agora mesmo</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
</body>

<?php
session_start();
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $email = $_POST["email"];
    $pass = $_POST["password"];
    $userNotFound = false;

    if (isset($_SESSION["users"])) {
        $users = $_SESSION["users"];

        foreach ($users as $key => $value) {
            if ($value["email"] === $email) {
                $userNotFound = false;
                if ($value["password"] === $pass) {
                    $_SESSION["user_logged"] = $value;
                    header("Location: http://localhost:3000/pages/home.php");
                    die();
                } else {
                    echo  "<script>alert('Senha Incorreta');</script>";
                }
                break;
            } else {
                $userNotFound = true;
            }
        }

        if ($userNotFound) {
            echo  "<script>alert('Não foi encontrado um usuário com essa conta de e-mail');</script>";
        }
    } else {
        echo  "<script>alert('Não há nenhum usuário cadastrado no sistema');</script>";
    }
}
?>

</html>