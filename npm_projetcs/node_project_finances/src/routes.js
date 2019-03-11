const express = require('express')

const routes = express.Router()

const BalanceController = require('./controllers/BalanceController');
const DebtController = require('./controllers/DebtController');

routes.get('/balances', BalanceController.indexBalance);
routes.get('/balances/:id', BalanceController.showBalance);
routes.post('/balances', BalanceController.newBalance);
routes.put('/balances/:id', BalanceController.updateBalance);
routes.delete('/balances/:id', BalanceController.destroyBalance);


routes.get('/debts', DebtController.indexDebts);
routes.get('/debts/:id', DebtController.showDebts);
routes.post('/debts', DebtController.newDebts);
routes.put('/debts/:id', DebtController.updateDebts);
routes.delete('/debts/:id', DebtController.destroyDebts);



module.exports = routes;