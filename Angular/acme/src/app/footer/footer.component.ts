import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  footerMessage: string;
  constructor(){
    this.footerMessage = "\u00A9 acme " + new Date().getFullYear();
  }

  ngOnInit(): void {
  }

}
