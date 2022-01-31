import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-number-api',
  templateUrl: './number-api.component.html',
  styleUrls: ['./number-api.component.css']
})
export class NumberApiComponent implements OnInit {

  textId = 'p';
  hidden1 = true;
  textItems : Array<NumberApi> = new Array<NumberApi>();
  constructor(private http: HttpClient) { }
  str = '';

  clickHandler(e:any) {
    this.str = "http://numbersapi.com/" + e + '?json';
    this.http.get<any>(this.str).subscribe((d) => {
      this.textItems.push(new NumberApi(d.text, new Date()));
      console.log(this.textItems);
    });
    this.hidden1 = false;
  }

  ngOnInit(): void {
  }

}

class NumberApi {
  constructor(public text: string, public date: Date) {}
}
