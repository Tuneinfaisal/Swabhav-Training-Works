import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ball-game',
  templateUrl: './ball-game.component.html',
  styleUrls: ['./ball-game.component.css']
})
export class BallGameComponent implements OnInit {

  public selectedRange!: number;
  public hideElement = false;
  public hideElement2 = true;
  public hideElement3 = true;
  public r!: number;
  public timer = 60;
  public count = 0;
  public balls: Array<Ball> = new Array<Ball>();

  constructor() { }

  setRange(range: any) {
    this.selectedRange = range;
  }

  makeList(size: any) {
    return new Array(size);
  }

  buttonClickHandler(button: any, e: any) {
    // console.log(e.target.innerText);
    console.log(button);
    var dis = this;
    this.count++;

    if(e.target.innerText < this.r) {
      button.style = 'background-color:green ;';
    }
    else if(e.target.innerText > this.r) {
      button.style = 'background-color:red ;';
    }
    else {
      button.style = 'background-color:blue ;';
      setTimeout(() => {
        alert("You won the game in " + this.count + " attempts");
        dis.hideElement2 = true;
        dis.hideElement3 = true;
      },500);
    }
  }

  startGame(value: any, gameBox: any) {
    this.hideElement = true;
    this.hideElement2 = false;
    this.hideElement3 = false;
    var dis = this;

    setInterval(function() {
      dis.timer -= 1;
    },1000);

    setTimeout(function() {
      alert("You loose");
      dis.hideElement2 = true;
      dis.hideElement3 = true;
    },60000);

    // gameBox.style = 'background-color:black ;'
    this.makeList(this.selectedRange);
    this.r = Math.floor(Math.random()*this.selectedRange + 1);
    console.log(this.r);

    for(let i=0;i<this.selectedRange;i++) {
      this.balls.push(new Ball(i, 'red'));
    }
  }

  ngOnInit(): void {
  }

}

export class Ball {
  constructor(public id:number, public color:string) {}
}
