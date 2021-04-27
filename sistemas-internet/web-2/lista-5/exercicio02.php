<h2>Exercício 02</h2>

<h3>Cadastro de um novo produto</h3>
<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
    <!-- <form method="post" action="./exercicio03.php"> -->
    <label for="codigo">Código do produto</label>
    <input type="text" name="codigo" placeholder="Código">
    <br><br>

    <label for="nome">Nome do produto</label>
    <input name="nome" type="text" placeholder="Insira o nome do produto">
    <br><br>

    <label for="tipo">Selecione o tipo do produto</label>
    <select name="tipo" id="">
        <option value="">Selecione um tipo....</option>
        <option value="perecivel">Perecível</option>
        <option value="tecnologia">Tecnologia</option>
        <option value="servico">Serviço</option>
    </select>
    <br><br>

    <label for="preco">Preço do produto</label>
    <input type="text" name="preco" id="" placeholder="Insira o preço">
    <br><br>

    <label for="author">Fabricante do produto</label>
    <input type="text" name="author" placeholder="Insira o nome do fabricante">
    <br><br>

    <input type="submit" value="Adicionar produto">

</form>

<table id="produtos" border="1">
    <tr>
        <th>Codigo</th>
        <th>Nome</th>
        <th>Categoria</th>
        <th>Preço</th>
        <th>Fabricante</th>
    </tr>


    <tr>
        <?php

        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            // echo $_POST;
            foreach ($_POST as $key => $value) {
                if (!is_null($value) && !empty($value)) {
                    echo "<td>$value</td>";
                } else {
                    echo "<td></td>";
                }
            }
        }

        ?>
    </tr>

</table>