import { Component, OnInit } from '@angular/core';
import { asyncScheduler, interval, map, Observable, observeOn } from 'rxjs';

@Component({
  selector: 'sw-welcome',
  templateUrl: './welcome.component.html',
  // styleUrls: ['./app.component.css']
})
export class WelcomeComponent implements OnInit{

  goalDetails: Observable<Goal>;

  constructor() {
    this.goalDetails=interval(3000)
    .pipe(map(n => {
      const t = new Date();
      return new Goal(n+1,new Date().toString())
    }));
  }

  getDataAsync1():Observable<number> {
    const observable = new Observable<number>((observer)=>{
      observer.next(10);
      observer.next(20);
      observer.next(30);
      observer.complete();
    })
    .pipe(observeOn(asyncScheduler))
    return observable;
  }

  getDataAsync2():Observable<number> {
    const publisher = interval(3000);
    return publisher;
  }

  getDataAsync3():Observable<any> {
    return interval(3000)
      .pipe(map(n => {
        const t = new Date();
        return {"time": t, "counter":n};
      }));
  }

  ngOnInit(): void {

    // this.goalDetails.subscribe(d=>{
    //   console.log("data arrived");
    //   console.log(d.count);
    //   console.log(d.time);
    // })

    // this.getDataAsync3()
    //     .subscribe(d=> {
    //       console.log("data arrived");
    //       console.log(d.counter);
    //       console.log(d.time);
    //     });

    // this.getDataAsync2()
    //     .subscribe((d)=> {
    //       console.log("data arrives");
    //       console.log(d);
    //     })

    // this.getDataAsync1()
    //     .subscribe(d=>{
    //       console.log("data arrived");
    //       console.log(d);
    //     })
    console.log("end of OnInit");
  }
}

export class Goal {
  constructor(public count:number,public time:string) {}
}


// message: string;
//   today: string;
//   randomValue: number;
//   ratingMessage:string;

//   constructor(){
//     console.log("cosntructor created");
//     this.message = "Welcome to SwabhavTech";
//     this.today = new Date().toString();
//     this.randomValue = Math.random();
//     this.ratingMessage = "123";
//   }

//   handelRatingClicked(e:string) {
//     console.log(e);
//     console.log(e.toUpperCase());
//     this.ratingMessage=e;
//   }

//   ngOnInit() {
//     console.log("component and view loaded successfully");
//     setTimeout(() => {
//       this.message = "Welcome to DataBinding after 3 sec.";
//       this.today = new Date().toString();
//     },3000)
//   }
