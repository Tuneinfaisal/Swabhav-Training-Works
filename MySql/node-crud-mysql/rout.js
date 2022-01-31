const express = require('express');
const router = express.Router();
const mysqlConnection = require('./connection');

router.get('/',(req,res) => {
    mysqlConnection.query("SELECT * from people", (err, rows, fields) => {
        if(!err) {
            console.log(rows);
            // res.send(rows);
        }
        else {
            console.log("error is " + err);
        }
    });
});

module.exports = router;