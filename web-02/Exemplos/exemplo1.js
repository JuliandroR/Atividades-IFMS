const soma = function (num1, num2) {
    return num1 + num2
}

//arrow function (=>): preferencialmente utilizá-la
const mult = (num1, num2) => num1 * num2

//high order function ou função de alto nível
const calc =  (operacao, num1, num2) => operacao(num1, num2)

console.log(calc(soma,3,20))

//template string
console.log(`Multiplicação : ${calc(mult, 3, 20)}`)