<h2>Exercício 05</h2>

<?php

    $capital = "Rio de Janeiro";

    switch(strtolower($capital)){
        case "campo grande":
            echo "<p>Campo grande possui 796.252 habitantes</p>";
            break;
        case "cuiabá":
            echo "<p>Cuiabá possui 618.124 habitantes</p>";
            break;
        case "goiânia":
            echo "<p>Goiânia possui 1.536.097 habitantes</p>";
            break;
        case "são paulo":
            echo "<p>São Paulo possui 12,33k habitantes</p>";
            break;
        case "rio de janeiro":
            echo "<p>Rio de Janeiro possui 6,748k habitantes</p>";
            break;
        default:
            echo "<p>Sem dados para a capital informada</p>";
            break;
    }

?>