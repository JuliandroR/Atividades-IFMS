<h2>Exercício 04</h2>

<?php

    $idade = 21;
    $sexo = "M";

    if($idade < 18 and $sexo == "H"){
        echo "Homem ou Pessoa Jovem";
    }else if($idade > 18 and $sexo != "H"){
        echo "Mulher ou Pessoa Adulta";
    }

?>