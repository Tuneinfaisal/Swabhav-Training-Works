const service = require("./m3.js")();
console.log({service});
console.log(service.getData());
service.doSomething();
console.log("end of m3_test");