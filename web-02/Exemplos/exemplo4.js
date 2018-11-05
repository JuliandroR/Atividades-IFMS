const fs = require('fs') //fs = filesystem

const readFile = (filename) => {
    return new Promise( (resolve, reject) => {
        fs.readFile(filename, (err, content) => {
            if (err) {
                reject(err)
            } else {
                resolve(content)
            }
        })
    })
}

const processaArquivos = async () => {
    const file1 = await readFile('exemplo1.js')
    console.log('file1: ', file1)

    const file2 = await readFile('exemplo2.js')
    console.log('file2: ', file2)
}

processaArquivos()
console.log('Fim da leitura')