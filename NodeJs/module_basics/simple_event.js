const EventEmitter = require('events');

var btn = new EventEmitter();

btn.on('myclick', godListener);
btn.on('myclick', devilListener);

btn.emit('myclick',{data:'test click data'});

function godListener(e) {
    console.log("God is listening");
    console.log(e);
}

function devilListener(e) {
    console.log("Devil is listening");
    console.log(e);
}

// const account = new EventEmitter();

console.log("end of program");