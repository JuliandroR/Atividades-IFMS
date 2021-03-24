<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/index.css">
    <script src="../js/imc.js"></script>
    <title>Cálculo IMC</title>
</head>

<body>
    <div class="content flex">
        <h1 class="title">Cálculo de IMC</h1>
        <form onsubmit="return calculaIMC()" method="post">
            <input type="text" id="peso" class="number_field" placeholder="Informe o peso em quilogramas">
            <input type="text" id="altura" class="number_field" placeholder="Informe a altura em metros.">
            <input type="submit" value="Calcular" class="button">
        </form>
        <div class="table_imc flex">
            <table border="1">
                <tr>
                    <th>Condição</th>
                    <th>Valores</th>
                </tr>
                <tr class="value">
                    <td>Abaixo do peso</td>
                    <td>Abaixo de 18,5</td>
                </tr>
                <tr class="value">
                    <td>Peso Normal</td>
                    <td>Entre 18,5 - 24,9</td>
                </tr>
                <tr class="value">
                    <td>Sobrepeso</td>
                    <td>Entre 25 - 29,9</td>
                </tr>
                <tr class="value">
                    <td>Obesidade grau I</td>
                    <td>Entre 30 - 34,9</td>
                </tr>
                <tr class="value">
                    <td>Obesidade grau II</td>
                    <td>Entre 35 - 39,9</td>
                </tr>
                <tr class="value">
                    <td>Obesidade grau III - Mórbida</td>
                    <td>Maior que 40</td>
                </tr>
            </table>
        </div>
    </div>
</body>
</html>