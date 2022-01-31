const mysql = require("mysql");
const readLineSync = require("readline-sync");

const con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "mysql512096",
    database: "monoceptdb"
});

const connectionString = "4040";
// sqlStatement = createConnection(connectionString)
const empno = readLineSync.question('enter empno : ');
const sqlStatement = `SELECT * FROM EMP WHERE EMPNO=${empno}`;

console.log(sqlStatement);
con.query(sqlStatement,(err,res) => {
    if(err) throw err;
    console.log(res.length);
    console.log(res[0].EMPNO, res[0].ENAME, res[0].SAL);
    console.log(res);
});

con.end();