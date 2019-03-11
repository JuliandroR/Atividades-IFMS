const mongoose = require('mongoose')

const BalanceSchema = new mongoose.Schema({
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

mongoose.model('Balance', BalanceSchema);