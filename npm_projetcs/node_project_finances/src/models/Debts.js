const mongoose = require('mongoose')

const DebtsSchema = new mongoose.Schema({
    title: {
        type: String,
        required: true,
    },
    value: {
        type: Number,
        required: true,
    },
    createdAt: {
        type: Date,
        default: Date.now,
    },
})

mongoose.model('Debts', DebtsSchema);