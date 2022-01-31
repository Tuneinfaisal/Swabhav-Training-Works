"use strict";
// import * as b from './bank-module'
exports.__esModule = true;
// let a = new b.Account(5000);
// let c = new b.Customer(1,"Sachin");
var bank_module_1 = require("./bank-module");
var b = new bank_module_1["default"]("SBI", "Delhi");
var a = new bank_module_1.Account(6000);
var c = new bank_module_1.Customer(2, "Sachin");
console.log(b);
console.log(a);
console.log(c);
