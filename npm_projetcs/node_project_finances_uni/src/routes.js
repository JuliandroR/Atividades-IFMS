const express = require('express')

const routes = express.Router()

const FinanceController = require('./controllers/FinanceController')

routes.get('/finances', FinanceController.indexFinances);
routes.get('/finances/balances', FinanceController.showBalance);
routes.get('/finances/debts', FinanceController.showDebts);
routes.post('/finances', FinanceController.newFinance);
routes.put('/finances/:id', FinanceController.updateFinance);
routes.delete('/finances/:id', FinanceController.destroyFinance);

module.exports = routes;
