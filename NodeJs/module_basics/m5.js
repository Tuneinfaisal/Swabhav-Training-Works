class Student {

    constructor(fullName,cgpa) {
        this.fullName = fullName;
        this.cgpa = cgpa;
    }

    getDetails = function() {
        return this.fullName + " " + this.cgpa;
    }

}

module.exports = Student;