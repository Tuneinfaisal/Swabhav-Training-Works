const cookie = require('./cookie.js');
const auth= require('./auth.js');
const log = require('./log.js');
const express = require('express');
const app = express();

app.use(cookie);
app.use(auth);
app.use(log);

app.get('/',(req,resp) => {
    resp.end("inside express route /");
})

app.get('/data',(req,resp) => {
    resp.end("inside express route /data");
})