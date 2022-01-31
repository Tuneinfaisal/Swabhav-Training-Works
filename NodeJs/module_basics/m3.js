const dataService = function() {
    var service = {}

    service.getData = function() {
        return Math.random()*10;
    }

    service.doSomething = function() {
        const time = Date.now();
        while(Date.now()-time < 3*1000);
        console.log("doSomething ended");
    }

    return service;
}

module.exports = dataService;