const express = require('express');
const bodyParser = require('body-parser');
const mysqlConnection = require('./connection')

const routes = require("./rout")

var app = express();
app.use(bodyParser.json());

app.use("/rout", routes);

// app.listen(5000);