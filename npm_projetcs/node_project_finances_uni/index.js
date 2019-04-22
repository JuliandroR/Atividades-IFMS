const express = require('express');
const mongoose = require('mongoose');
const requireDir = require('require-dir')
const cors = require('cors');


// Iniciando o app
const app = express();
app.use(express.json());
app.use(cors());

// Iniciando o DB
mongoose.connect(
    'mongodb+srv://juliandro:juliandro@cluster0-rfl8k.mongodb.net/test?retryWrites=true',
    { useNewUrlParser: true }
)
    .then(() => console.log('MongoDB Connected'))
    .catch(err => console.log(err));

requireDir('./src/models');

// rotas
app.use('/api', require('./src/routes'))

app.listen(3000);