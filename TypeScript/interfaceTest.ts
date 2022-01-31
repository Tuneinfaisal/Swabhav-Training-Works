interface ICustomer {
    id : number,
    firstName : string,
    lastName : string,
    location ? : string
}

printDetails([{firstName:"Sachin",id:101,lastName:"Tendulkar"},
{firstName:"Virat",id:102,lastName:"Kohli",location:"Mu"}]);

function printDetails(customers : Array<ICustomer>) {
    for(let c of customers) {
        console.log(c);
    }
}