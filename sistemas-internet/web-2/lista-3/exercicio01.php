<h2>Atividade 01</h2>
<?php
$num = 20;

if ($num % 10 === 0) {
    echo "<p>É divisível por 10</p>";
}
if ($num % 5 === 0) {
    echo "<p>É divisível por 5</p>";
}
if ($num % 2 === 0) {
    echo "<p>É divisível por 2</p>";
}
if ($num % 10 !== 0 && $num % 5 !== 0 && $num % 2 !== 0) {
    echo "Não é divisível por nenhum número definido";
};

?>