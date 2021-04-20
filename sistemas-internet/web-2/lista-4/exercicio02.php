<?php

$num = 10;
$produto = 1;
$cont = 1;

while ($cont < ($num + 1)) {
    echo "<span>$cont</span>";
    if ($cont < $num) {
        echo ("<span> - </span>");
    }
    $produto *= $cont;
    $cont += 1;
}

echo "<p>O produto dos números informados é: $produto</p>";
