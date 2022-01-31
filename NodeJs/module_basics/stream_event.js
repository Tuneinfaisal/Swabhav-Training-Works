const fs = require('fs');
var reader = fs.createReadStream('./hello_data.txt');

reader.on('data',(chunk_data) => {
    console.log(chunk_data);
    console.log(chunk_data.length);
    console.log(chunk_data.toString());
});

reader.on('open', () => {
    console.log("file is open");
});

reader.on('close', () => {
    console.log("file is open");
});

console.log("end of program");