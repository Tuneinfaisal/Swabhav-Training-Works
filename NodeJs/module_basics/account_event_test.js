const Account = require('./account_event');
const a1 = new Account(101,"Faisal",5000);
a1.on('balance_changed',sendSms);
a1.on('balance_changed',sendEmail);
a1.deposit(5000);

function sendSms(a1) {
    console.log(`Sms : balance change for ${a1.getName()} new balance : ${a1.getBalance()}`);
}

function sendEmail(a1) {
    console.log(`Email : balance change for ${a1.getName()} new balance : ${a1.getBalance()}`);
}