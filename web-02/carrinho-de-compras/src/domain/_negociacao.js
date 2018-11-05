const negociacao = {
    descricao: 'Lápis',
    quant: 3,
    valor: 2.30,

    mostrarDados: function () {
        return `Descrição: ${this.descricao}
        Quantidade: ${this.quant}
        Valor Unitário: ${this.valor}`
    },

    valorTotal: function () {
        return `Total ${this.quant * this.valor}`
    }
}

console.log(`${mostrarDados()}
${valorTotal()}`)

