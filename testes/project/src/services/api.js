import axios from 'axios';

const api = axios.create({
  baseURL: 'http://192.168.0.105:3000/api'
  // baseURL: 'http://172.23.152.90:3000/api'
});

export default api;