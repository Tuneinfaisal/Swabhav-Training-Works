import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'sw-star',
  templateUrl: './star.component.html',
  styleUrls: ['./star.component.css']
})
export class StarComponent implements OnInit {

  @Input()
  rating:number = 1;

  @Output()
  ratingClicked:EventEmitter<string> = new EventEmitter<string>();
  constructor() {
    console.log(this.rating, "isnide constructor");
  }

  ngOnInit(): void {
    console.log(this.rating, "inside onInit");
  }

  clickHandler() {
    // console.log("click handler");
    this.ratingClicked.emit(`Somebody clicked on rating ${this.rating}`);
  }

}
