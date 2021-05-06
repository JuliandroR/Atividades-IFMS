<!-- 
    Juliandro Rocha Ribeiro
    Desenvolvimento Web II
    Turma TSI-3712
 -->

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

<h2>Exercicio 01</h2>

<!-- Monte um formulário que recebe o nome, telefone e email
de uma pessoa e três notas de suas provas e aplique as
verificações com expressões regulares sobre os dados
recebidos para garantir a entrada correta dos dados. -->

<form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>" class="container">
    <div class="mb-1">
        <label for="name" class="form-label">Informe o nome</label>
        <input type="text" name="name" class="form-control" id="name">
    </div>

    <div class="mb-1">
        <label for="email" class="form-label">Informe o e-mail</label>
        <input type="email" name="email" class="form-control" id="email">
    </div>

    <div class="mb-1">
        <label for="phone" class="form-label">Informe o telefone</label>
        <input type="tel" name="phone" class="form-control" id="phone">
    </div>

    <div class="mb-1">
        <label for="phone" class="form-label">Informe as notas</label>
        <div class="container">
            <div class="row">
                <div class="col-sm">
                    <input type="number" name="nota01" class="form-control" min="0" step=".01" placeholder="Nota 01">
                </div>
                <div class="col-sm">
                    <input type="number" name="nota02" class="form-control" min="0" step=".01" placeholder="Nota 02">
                </div>
                <div class="col-sm">
                    <input type="number" name="nota03" class="form-control" min="0" step=".01" placeholder="Nota 03">
                </div>
            </div>
        </div>
    </div>


    <button type="submit" class="btn btn-primary">Validar</button>
</form>


<?php
echo '<div class="container">';
$name = htmlspecialchars($_POST["name"]);
$email = htmlspecialchars($_POST["email"]);
$phone = htmlspecialchars($_POST["phone"]);
$notas = array(
    htmlspecialchars($_POST["nota01"]),
    htmlspecialchars($_POST["nota02"]),
    htmlspecialchars($_POST["nota03"])
);

$cont = 0;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (preg_match("/[A-Z][a-z]* [A-Z][a-z]*/", $name)) {
        echo "<div class='alert alert-danger' role='alert'> O nome $name está incorreto </div>";
    } else {
        // echo "<div class='alert alert-success' role='alert'> O nome $name está correto </div>";
        $cont += 1;
    }

    if (preg_match('/^([a-z]){1,}([a-z0-9._-]){1,}([@]){1}([a-z]){2,}([.]){1}([a-z]){2,}([.]?){1}([a-z]?){2,}$/i', $email)) {
        // echo "<div class='alert alert-success' role='alert'> O e-mail $email está correto </div>";
        $cont += 1;
    } else {
        echo "<div class='alert alert-danger' role='alert'> O e-mail $email está incorreto </div>";
    }

    if (preg_match('^\(+[0-9]{2,3}\) [9]{1,1}[0-9]{4}-[0-9]{4}$^', $phone)) {
        // echo "<div class='alert alert-success' role='alert'> O telefone $phone está correto </div>";
        $cont += 1;
    } else {
        echo "<div class='alert alert-danger' role='alert'> O telefone $phone está incorreto </div>";
    }

    foreach ($notas as $key => $value) {
        $position = $key + 1;
        if (preg_match("/^[0-9]$|10|\d+\.\d+/", $value)) {
            // echo "<div class='alert alert-success' role='alert'> A nota $position, de valor $value está correta </div>";
            $cont += 1;
        } else {
            echo "<div class='alert alert-danger' role='alert'> A nota $position, de valor $value está incorreta </div>";
        }
    }
};
echo '</div>';
if($cont == 6){
    $media = ($notas[0] + $notas[1] + $notas[2]) / 3;
    echo <<<EOF
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Nome</th>
                    <th scope="col">E-mail</th>
                    <th scope="col">Telefone</th>
                    <th scope="col">Notas</th>
                    <th scope="col">Média</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td scope='row'>$name</td>
                    <td scope='row'>$email</td>
                    <td scope='row'>$phone</td>
                    <td scope='row'>$notas[0] - $notas[1] - $notas[2]</td>
                    <td scope='row'>$media</td>
                </tr>
            </tbody>
        </table>
    </div>
    EOF;
};

?>