console.log(global.process == process);
console.log(global.setTimeout == setTimeout);
setTimeout(() => function() {
    console.log("after 3 sec.");
},3000);
console.log("end");
console.log(global);