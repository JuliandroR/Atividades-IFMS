const mongoose = require('mongoose')

const Balance = mongoose.model('Balance');

module.exports = {
    async indexBalance(req, res) {
        const balances = await Balance.find();

        return res.json(balances);
    },

    async showBalance(req, res){
        const balance = await Balance.findById(req.params.id)

        return res.json(balance);
    },

    async newBalance(req, res){
        const balance = await Balance.create(req.body);

        return res.json(balance);
    },

    async updateBalance(req, res){
        const balance = await Balance.findByIdAndUpdate(req.params.id, req.body, { new: true })

        return res.json(balance);
    },

    async destroyBalance(req, res){
        await Balance.findByIdAndRemove(req.params.id);

        return res.send();
    }
}