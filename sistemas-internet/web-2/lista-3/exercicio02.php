<h2>Exercício 02</h2>
<?php

    $num1 = 145;
    $num2 = 569;
    $num3 = 1452;

    $aux = $num1;
    if($num2 > $num1){
        $aux = $num2;
        $num2 = $num1;
        $num1 = $aux;
    };

    if($num3 > $num2){
        $aux = $num3;
        $num3 = $num1;
        $num1 = $aux;
    }

    if($num3 > $num2){
        $aux = $num3;
        $num3 = $num2;
        $num2 = $aux;
    }

    echo "Números em ordem decrescente: $num1, $num2, $num3 .";

?>