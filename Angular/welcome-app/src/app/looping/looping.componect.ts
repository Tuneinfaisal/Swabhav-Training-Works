import { Component } from "@angular/core";

@Component({
    selector: 'sw-looping',
    templateUrl: 'looping.component.html',
})
export class LoopingComponent{

    makeList(size:number){
        return new Array(size);
    }

    // getColor(isEven:boolean) {
    //     return isEven? 'green': 'blue';
    // }

    constructor() {
        console.log("looping component");
    }

}