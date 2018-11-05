//const NegociacaoController = require('./domain/NegociacaoController') //armazena em uma constante os que foi requisitado através do meio riquire
const controller = new NegociacaoController()

document
  .querySelector('.formulario') //seleciona os elementos da classe .formlario
  .addEventListener('submit', (evento) =>{ //realiza uma ação mediante retorno, no caso a ação de submit
    controller.adiciona(evento)
})
