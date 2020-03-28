class Negociacao {
    constructor( descricao, quant, valorUnit ){
        this.descricao = descricao
        this.quant = quant
        this.valorUnit = valorUnit
    }

    valorUnitarioTotal() {
        return this.quant * this.valorUnit
    }
}

const n = new Negociacao('Lápis', 3, 2.30)

console.log(n.descricao)
console.log(n.quant)
console.log(n.valorUnit)
console.log(n.valorUnitarioTotal())
