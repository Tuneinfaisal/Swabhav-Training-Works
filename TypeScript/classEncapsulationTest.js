var Account = /** @class */ (function () {
    function Account(_accno, _name, _balance) {
        this._accno = _accno;
        this._name = _name;
        this._balance = _balance;
    }
    Account.prototype.deposit = function (amount) {
        this._balance += amount;
    };
    Object.defineProperty(Account.prototype, "accno", {
        get: function () {
            return this._accno;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Account.prototype, "name", {
        get: function () {
            return this._name;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Account.prototype, "balance", {
        get: function () {
            return this._balance;
        },
        enumerable: false,
        configurable: true
    });
    return Account;
}());
var acc1 = new Account(101, "Sachin", 5000);
acc1.deposit(2000);
console.log(acc1.accno);
console.log(acc1.name);
console.log(acc1.balance);
console.log(acc1);
