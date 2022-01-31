printDetails([{ firstName: "Sachin", id: 101, lastName: "Tendulkar" },
    { firstName: "Virat", id: 102, lastName: "Kohli", location: "Mu" }]);
function printDetails(customers) {
    for (var c in customers) {
        console.log(c);
    }
}
