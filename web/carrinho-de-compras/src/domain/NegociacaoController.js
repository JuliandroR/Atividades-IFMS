class NegociacaoController {
  adciona() {
    evento.preventDefault(); //impede que o submit realiize sua ação padrão
    console.log("Chamou!!");

    let inputs = document.querySelectorAll('.campos') //captura todos os dados de elementos que possuem atribuidos a si a classe .campos
    console.log(inputs)
  }
}

//module.exports = NegociacaoController;
