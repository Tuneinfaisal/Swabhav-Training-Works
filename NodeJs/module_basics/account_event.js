const EventEmitter = require('events');

class Account extends EventEmitter {
    constructor(accno,name,balance) {
        super();
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    deposit(amt) {
        this.balance += amt;
        this.emit('balance_changed',this);;
    }

    withdraw(amt) {
        if(this.balance-amt < 500) {
            throw Error("insufficient balance")
        }
        this.balance -= amt;
        this.emit('balance_changed',this);
    }

    getName() {
        return this.name;
    }

    getBalance() {
        return this.balance;
    }
}

module.exports = Account;