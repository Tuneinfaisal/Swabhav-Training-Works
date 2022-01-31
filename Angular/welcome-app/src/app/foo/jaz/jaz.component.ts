import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sw-foo-jaz',
  templateUrl: './jaz.component.html',
  styleUrls: ['./jaz.component.css']
})
export class JazComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  getArray(size:number) {
    return new Array<number>(size);
  }

}
