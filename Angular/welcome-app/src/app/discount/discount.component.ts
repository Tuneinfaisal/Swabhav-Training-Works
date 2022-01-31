import { Component } from '@angular/core';

@Component({
  selector: 'sw-discount',
  templateUrl: './discount.component.html',
  styleUrls: ['./discount.component.css']
})

export class DiscountComponent {

  amountText!:number;
  rateText!:number;
  discountAmount!:number;

  getDiscount() {
    this.discountAmount = (this.amountText/100) * this.rateText;
  }

}