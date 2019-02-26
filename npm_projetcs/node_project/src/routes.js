const express = require('express');
const routes = express.Router();

const AssignmentController = require('./controllers/AssignmentController');

routes.get('/assignment', AssignmentController.index);
routes.get('/assignment/:id', AssignmentController.show);
routes.post('/assignment', AssignmentController.new)
routes.put('/assignment/:id', AssignmentController.update);
routes.delete('/assignment/:id', AssignmentController.destroy);

module.exports = routes;