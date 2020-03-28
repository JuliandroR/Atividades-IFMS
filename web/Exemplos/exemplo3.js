const fs = require('fs') //fs = filesystem

const callback = (err, content) => {
    if (err) {
        console.log('error', err)
    } else {
        fs.writeFile('exemplo1.js', call)
        console.log(content)
        console.log(new String(content))
    }

}

fs.readFile('exemplo1.js', callback)

console.log('Fim da leitura do arquivo')