// import * as b from './bank-module'

// let a = new b.Account(5000);
// let c = new b.Customer(1,"Sachin");

import Bank,{Account,Customer} from './bank-module'

let b = new Bank("SBI", "Delhi");
let a = new Account(6000);
let c = new Customer(2,"Sachin");

console.log(b);
console.log(a);
console.log(c);
