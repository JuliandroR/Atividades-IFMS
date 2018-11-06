const express = require('express')

const app = express()

app.set('view engine', 'ejs')

const port = process.env.PORT || 3000

let i = 0
const ola = 'Hello Diego'
const resolver = (request, response) => {
    i++
const obj = {
    i,
    ola
}

    //response.send(`Quase Twitter App ${i}`)
    response.render('index', obj)
}

app.get('/', resolver)

app.listen(port, (err) => {
    if(err){
        console.log('error: ', err)
    }else{
        console.log('Quase Twitter App está rodando na porta: ', port)
    }
})