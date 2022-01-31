class Account {

    constructor(id,name,balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    deposit = function(amount) {
        this.balance += amount;
    }

    getId = function() {
        return this.id;
    }

    getName = function() {
        return this.name;
    }

    getBalance = function() {
        return this.balance;
    }
}

module.exports = Account;