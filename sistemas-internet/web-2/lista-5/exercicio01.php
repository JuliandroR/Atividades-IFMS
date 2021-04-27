<h1>Exercício 01</h1>

<form method="POST">
    <input type="number" name="valor" id="valor" placeholder="Valor em reais">
    <input type="submit" value="Calcular">
</form>

<?php
$moedas = array(
    "Dólar" => 0.18,
    "Rúpias" => 13.75,
    "Somoni" => 2.10,
);

$valor_real = $_POST["valor"];

if (isset($valor_real) && !empty($valor_real)) {
    foreach ($moedas as $moeda => $valor) {
        $resultado = $valor * (float)$_POST["valor"];
        echo "<p>$valor_real reais em <b>$moeda</b> é: $resultado</p>";
    };
};

?>