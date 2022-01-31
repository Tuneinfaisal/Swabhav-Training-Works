import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sw-twoway-binding2',
  templateUrl: './twoway-binding2.component.html',
  styleUrls: ['./twoway-binding2.component.css']
})
export class TwowayBinding2Component implements OnInit {

  textName: string = "";
  fontSize: number = 0;
  fontColor: string = "";
  constructor() { }

  ngOnInit(): void {
  }

}
