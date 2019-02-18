const express = require('express')
express.Router();

const ProductController = require('./controllers/ProductController')


routes.get('/products', ProductController.indexedDB);
routes.get('/products/:id', ProductController.show);
routes.post('/products', ProductController.store);
routes.put('/products/:id', ProductController.update)
routes.delete('/products/:id', ProductController.destroy);

module.exports = routes;