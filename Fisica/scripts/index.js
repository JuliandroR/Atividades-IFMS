let valorKhw = 0;
let potencia = 0;
let validaty = true;
let result_final = 0.0
let tempo_utilizado = 0;
let produto = "";

function definirValor(){
    valorKhw = parseFloat(document.getElementById('type_immobile').value);
    // console.log(document.getElementById("type_immobile").options[document.getElementById("type_immobile").selectedIndex].text);

    
    
    if(valorKhw == 0.54500){
        adicionaClassInvisible('type_item_industrial')
        adicionaClassInvisible('type_item_rural')
        adicionaClassInvisible('input_pot')
        adicionaClassInvisible('description_pot')
        removeClassInvisible('type_item_home');
        remover_todos("retorno");
        altera_total(0.0);
        result_final = 0.0;
    }else if(valorKhw == 0.38151){
        adicionaClassInvisible('type_item_home')
        adicionaClassInvisible('type_item_industrial')
        removeClassInvisible('type_item_rural');
        adicionaClassInvisible('input_pot')
        adicionaClassInvisible('description_pot')
        remover_todos("retorno");
        altera_total(0.0);
        result_final = 0.0;
    }else if(valorKhw == 0.54501){
        adicionaClassInvisible('type_item_home')
        adicionaClassInvisible('input_pot')
        adicionaClassInvisible('description_pot')
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
        removeClassInvisible('description_pot')
        validaty = false;
    }else{
        potencia = parseFloat(pot);  
        adicionaClassInvisible('input_pot')  
        adicionaClassInvisible('description_pot')
        validaty = true;
        produto = `${document.getElementById(elemento).options[document.getElementById(elemento).selectedIndex].text}`
    }
}

var button = document.querySelector('#calcular');

button.addEventListener('click', function () {
    tempo_utilizado = parseFloat(document.getElementById('time_used').value);
    if (validaty == false) {
        potencia = parseFloat(document.getElementById('input_pot').value)
        produto = document.getElementById('description_pot').value
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
    var addc = document.createTextNode(`O consumo do produto ${produto} em KwH é: ${potencia}. Foi utilizado por: ${tempo} horas. O custo foi: R$ ${custo}`);
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