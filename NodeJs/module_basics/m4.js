function Customer(firstName,lastName) {
    // console.log({this});
    this.firstName = firstName;
    this.lastName = lastName;
}

Customer.prototype.fullName = function() {
    return this.firstName + " - " + this.lastName;
}

module.exports = Customer;