// const { createPool } = require('mysql');

// const pool = createPool({
//     host:"localhost",
//     user:"root",
//     password:"mysql512096",
//     database:"swabhav",
//     connectionLimit:10
// })

// pool.query("select * from employee",(err,res,firld) =>{
//     if(err) {
//         return console.log(err);
//     }
//     return console.log(res);
// })

const mysql = require('mysql');
const connection = mysql.createConnection({
    host : "localhost",
    user : "root",
    password : "",
    database : "swabhav"
})

connection.query("select * from employee",(err,res,firld) =>{
    if(err) {
        console.log(err);
    }
    console.log(res);
})