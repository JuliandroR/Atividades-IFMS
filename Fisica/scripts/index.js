let valorKhw = 0;
let potencia = 0;
let validaty = true;

function definirValor(){
    valorKhw = parseFloat(document.getElementById('type_immobile').value);
    console.log(valorKhw);
}

function definirPotencia(){
    value = document.getElementById('type_item').value;

    if(value != "000"){
        potencia = parseFloat(value);
        validaty = true;
    }else{
        removeClassInvisible('input_pot', 'invisible');
        validaty = false;
    }
};

function removeClassInvisible(elemento, classe){
    var element = document.getElementById(elemento);
    element.classList.remove(classe);
}

var button = document.querySelector('#calcular');

button.addEventListener('click', function () {
    if(validaty == false){
        potencia = parseFloat(document.getElementById('time_used').value)
    }
    alert(`O valor a ser pago com as informações fornecidas é: ${(potencia/100)*valorKhw}`);
});