function calculaIMC() {
    let peso = parseFloat(document.getElementById("peso").value);
    let altura = parseFloat(document.getElementById("altura").value);
    let value = peso / (altura * altura);

    alert(`O valor do IMC é: ${value}`);

    if (value < 18.5) {
        document.getElementsByClassName("value")[0].style.backgroundColor =
            "#FFA384";
    } else if (value >= 18.5 && value < 25) {
        document.getElementsByClassName("value")[1].style.backgroundColor =
            "#FFA384";
    } else if (value >= 25 && value < 30) {
        document.getElementsByClassName("value")[2].style.backgroundColor =
            "#FFA384";
    } else if (value >= 30 && value < 35) {
        document.getElementsByClassName("value")[3].style.backgroundColor =
            "#FFA384";
    }
    else if (value >= 35 && value < 40) {
        document.getElementsByClassName("value")[4].style.backgroundColor =
            "#FFA384";
    }
    else if (value >= 40) {
        document.getElementsByClassName("value")[5].style.backgroundColor =
            "#FFA384";
    }
    return false;
}
