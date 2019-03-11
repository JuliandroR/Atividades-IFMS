const mongoose = require('mongoose')

const Finance = mongoose.model('Finance');

module.exports = {
    async indexFinances(req, res) {
        const debts = await Finance.find();

        return res.json(debts);
    },

    async showDebts(req, res){
        const debt = await Finance.find({ "type": "debts" })

        return res.json(debt);
    },

    async showBalance(req, res){
        const balances = await Finance.find({ "type": "balances" })

        return res.json(balances);
    },

    async newFinance(req, res){
        const finance = await Finance.create(req.body);

        return res.json(finance);
    },

    async updateFinance(req, res){
        const finance = await Finance.findByIdAndUpdate(req.params.id, req.body, { new: true })

        return res.json(finance);
    },

    async destroyFinance(req, res){
        await Finance.findByIdAndRemove(req.params.id);

        return res.send();
    }
}