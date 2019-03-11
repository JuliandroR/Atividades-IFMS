const mongoose = require('mongoose')

const Debts = mongoose.model('Debts');

module.exports = {
    async indexDebts(req, res) {
        const debts = await Debts.find();

        return res.json(debts);
    },

    async showDebts(req, res){
        const debt = await Debts.findById(req.params.id)

        return res.json(debt);
    },

    async newDebts(req, res){
        const debt = await Debts.create(req.body);

        return res.json(debt);
    },

    async updateDebts(req, res){
        const debt = await Debts.findByIdAndUpdate(req.params.id, req.body, { new: true })

        return res.json(debt);
    },

    async destroyDebts(req, res){
        await Debts.findByIdAndRemove(req.params.id);

        return res.send();
    }
}