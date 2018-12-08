let valorKhw = 0;
let potencia = 0;
let validaty = true;
let result_final = 0.0
let tempo_utilizado = 0;

function definirValor(){
    valorKhw = parseFloat(document.getElementById('type_immobile').value);
    if(valorKhw == 0.54500){
        adicionaClassInvisible('type_item_industrial')
        adicionaClassInvisible('type_item_rural')
        adicionaClassInvisible('input_pot')
        removeClassInvisible('type_item_home');
        remover_todos("retorno");
        altera_total(0.0);
        result_final = 0.0;
    }else if(valorKhw == 0.38151){
        adicionaClassInvisible('type_item_home')
        adicionaClassInvisible('type_item_industrial')
        removeClassInvisible('type_item_rural');
        adicionaClassInvisible('input_pot')
        remover_todos("retorno");
        altera_total(0.0);
        result_final = 0.0;
    }else if(valorKhw == 0.54501){
        adicionaClassInvisible('type_item_home')
        adicionaClassInvisible('input_pot')
        adicionaClassInvisible('type_item_rural')
        removeClassInvisible('type_item_industrial');
        remover_todos("retorno");
        altera_total(0.0);
        result_final = 0.0;
    }else{}
}

function definirPotencia(elemento){
    let pot = (document.getElementById(elemento).value);
    if(pot == "000"){
        removeClassInvisible('input_pot');
        validaty = false;
    }else{
        potencia = parseFloat(pot);  
        adicionaClassInvisible('input_pot')  
        validaty = true;
    }
}

var button = document.querySelector('#calcular');

button.addEventListener('click', function () {
    tempo_utilizado = parseFloat(document.getElementById('time_used').value);
    if (validaty == false) {
        potencia = parseFloat(document.getElementById('input_pot').value)
    }
    let result = ((potencia*tempo_utilizado)*valorKhw);
    result_final += parseFloat(result.toFixed(2));

    retornaHtml(potencia, tempo_utilizado, result);
    altera_total(result_final);
});


function removeClassInvisible(elemento) {
    var element = document.getElementById(elemento);
    element.classList.remove("invisible");
}

function adicionaClassInvisible(elemento){
    var element = document.getElementById(elemento);
    element.classList.add("invisible");
}

function retornaHtml(potencia, tempo, custo) {
    var pNova = document.createElement('p');
    var addc = document.createTextNode(`O consumo do produto em KhW é: ${potencia}. Foi utilizado por: ${tempo} horas. O custo foi: R$ ${custo}`);
    pNova.appendChild(addc);
    var div = document.getElementById('retorno')
    div.appendChild(pNova)
}

function remover_todos(elemento) {
    var elemento = document.getElementById(elemento);
    while (elemento.firstChild) {
            elemento.removeChild(elemento.firstChild);
    }
}

function altera_total(valor){
    document.getElementById('resultado').innerHTML = parseFloat(valor.toFixed(2));
}