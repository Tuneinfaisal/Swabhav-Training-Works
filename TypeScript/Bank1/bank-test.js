"use strict";
exports.__esModule = true;
var bank_module_1 = require("./bank-module");
var a = new bank_module_1.Account(101);
var b = new bank_module_1.Bank("Axis", "Dehradun");
var c = new bank_module_1.Customer(1, "Sachin");
console.log(a, b, c);
console.log({ a: a, b: b, c: c });
