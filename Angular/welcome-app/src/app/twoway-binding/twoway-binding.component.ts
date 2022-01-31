import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sw-twoway-binding',
  templateUrl: './twoway-binding.component.html',
  styleUrls: ['./twoway-binding.component.css']
})
export class TwowayBindingComponent implements OnInit {

  salary: number = 100000;
  favLanguage: string = "";
  constructor() { }

  ngOnInit(): void {
  }

}
