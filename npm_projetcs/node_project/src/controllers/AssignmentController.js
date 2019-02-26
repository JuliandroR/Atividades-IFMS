const mongoose = require('mongoose');

const Product = mongoose.model('Assignment');

module.exports = {
  async index(req, res) {
    const { page = 1 } = req.query;
    const assignments = await Assignment.paginate({}, { page, limit: 10 });

    return res.json(assignments);
  },

  async show(req, res) {
    const assignment = await Assignment.findById(req.params.id);

    return res.json(assignment);
  },

  async new(req, res) {
    const assignment = await Assignment.create(req.body);
    
    return res.json(assignment);
  },

  async update(req, res) {
    const assignment = await Assignment.findByIdAndUpdate(req.params.id, req.body, { new: true });

    return res.json(assignment);
  },

  async destroy(req, res) {
    await Assignment.findByIdAndRemove(req.params.id);

    return res.send();
  }
};