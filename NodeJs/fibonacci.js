
const {parentPort, workerData} = require("worker_threads");

parentPort.postMessage(getFib(workerData.num));

function getFib(num) {

    if(num <= 1){
        return num;
    }

    let firstNum = getFib(num - 1);
    let secondNum = getFib(num - 2);

    return firstNum + secondNum;
}