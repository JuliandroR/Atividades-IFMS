<h2>Exercício 03</h2>

<?php

    $idade = 21;
    $sexo = "M";

    if($idade < 18 && $sexo === "F"){
        echo "<p>Mulher jovem</p>";
    }else if($idade >= 18 && $sexo === "F"){
        echo "<p>Mulher adulta</p>";
    }
    else if($idade < 18 && $sexo === "M"){
        echo "<p>Homem jovem</p>";
    }else if($idade >= 18 && $sexo === "M"){
        echo "<p>Homem adulto</p>";
    }else{
        echo "<p>Alguma informação não foi inserida corretamente.</p>";
    };

?>