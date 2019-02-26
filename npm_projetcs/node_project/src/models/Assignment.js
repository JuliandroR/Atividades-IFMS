const mongoose = require('mongoose');
const mongoosePaginate = require('mongoose-paginate');

const AssignmentSchema = new mongoose.Schema({
  discipline: {
    type: String,
    required: true,
  },
  description: {
    type: String,
    required: true,
  },
  delivery_date: {
    type: Date,
    required: true,
  },
  createdAt: {
    type: Date,
    default: Date.now,
  },
});

AssignmentSchema.plugin(mongoosePaginate);

mongoose.model('Assignment', AssignmentSchema);