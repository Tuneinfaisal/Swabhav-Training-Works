import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sw-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  makeList(size:number) {
    return new Array(size);
  }

  students: Array<Student> = new Array<Student>();

  // student1 = new Student1("Rohit",8,new Date());
  // student2 = new Student2("Faisal",7,new Date());
  // student3 = new Student3("Anu",9,new Date());
  // student4 = new Student4("Rahul",6,new Date());
  // student5 = new Student5("Mohit",5,new Date());

  constructor() {
    this.students.push(new Student("Rohit",8,new Date()));
    this.students.push(new Student("Faisal",7,new Date()));
    this.students.push(new Student("Anu",9,new Date()));
    this.students.push(new Student("Rahul",6,new Date()));
    this.students.push(new Student("Mohit",5,new Date()));
  }

  ngOnInit(): void {
  }

}

export class Student{
  constructor(public fullName:string,public cgpa:number,public doj:Date) {
  }
}
// export class Student2{
//   constructor(public fullName:string,public cgpa:number,public doj:Date) {
//   }
// }
// export class Student3{
//   constructor(public fullName:string,public cgpa:number,public doj:Date) {
//   }
// }
// export class Student4{
//   constructor(public fullName:string,public cgpa:number,public doj:Date) {
//   }
// }
// export class Student5{
//   constructor(public fullName:string,public cgpa:number,public doj:Date) {
//   }
// }
