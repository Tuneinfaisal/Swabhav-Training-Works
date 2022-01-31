import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sw-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {

  greetingMessage: string;
  constructor() {
    this.greetingMessage = "";
  }

  handleGreet(userName: string) {
    let hrs = new Date().getHours();
    let time = hrs<12? "morning" : hrs<18? "afternoon" : "evening";
    this.greetingMessage = `Hello ${userName} , Good ${time}`;
  }

  ngOnInit(): void {
  }

}
