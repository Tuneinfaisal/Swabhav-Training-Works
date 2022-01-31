import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sw-foo-bar',
  templateUrl: './bar.component.html',
  styleUrls: ['./bar.component.css']
})
export class BarComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  getArray(size:number) {
    return new Array<number>(size);
  }

}
