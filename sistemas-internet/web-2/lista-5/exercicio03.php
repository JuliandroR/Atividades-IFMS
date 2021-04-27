<h2>Exercício 03</h2>

<h3>Dados recebidos</h3>
    <?php

    if (!is_null($_POST) && !empty($_POST) && isset($_POST)) {
        echo "<table border='1'>";
            echo "<tr>";
                echo "<th>Name</th>";
                echo "<th>Value</th>";
            echo "</tr>";
            foreach ($_POST as $key => $value) {
            echo "<tr>";
                echo "<td>$key</td>";
                echo "<td>$value</td>";
            echo "</tr>";
            }
        echo "</table>";
    } else {
        echo "<p>Não há informações para serem exibidas</p>";
    }

    ?>