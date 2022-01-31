const Account = require("./account.js");
const a1 = new Account(101,"Faisal",500000);

a1.deposit(5000);

getDetails = function() {
    console.log("Id is : " + a1.getId());
    console.log("Name is : " + a1.getName());
    console.log("Balance is : " + a1.getBalance());
}

getDetails();