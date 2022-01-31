class Account
{
    constructor(private _accno:number,private _name:string,private _balance:number){}

    deposit(amount) {
        this._balance += amount;
    }

    get accno() {
        return this._accno;
    }
    
    get name() {
        return this._name;
    }

    get balance() {
        return this._balance;
    }
}

let acc1 = new Account(101,"Sachin",5000);
acc1.deposit(2000);
console.log(acc1.accno);
console.log(acc1.name);
console.log(acc1.balance);
console.log(acc1);