//JS mono-thread
//JS Assícrono

console.log("Passo 1")

const ola = () => console.log('olá')

setTimeout(ola, 3000)

console.log('passo 2')