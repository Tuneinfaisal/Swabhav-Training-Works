const http = require('http');
const server = http.createServer();
server.on('request',sayHello);

function sayHello(req, resp) {
    console.log("inside sayHello()");
    console.log("client made a request");
    return resp.end("<h1> Hello says node server </h1>");
}

server.listen(9090);
console.log("end of program");