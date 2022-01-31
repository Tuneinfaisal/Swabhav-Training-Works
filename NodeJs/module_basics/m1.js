var baz = 100;
console.log("m1 loaded");
console.log(exports == module.exports);
exports.foo = 123;
exports.bar = 456;
module.exports.jaz = 789;
console.log(exports);