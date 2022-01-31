import { Injectable } from '@angular/core';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products : Array<Product> = new Array<Product>();
  constructor() {
    console.log("service created");
    this.products.push(new Product(1,"Book",4));
    this.products.push(new Product(2,"Pen",3.5));
    this.products.push(new Product(3,"Pencil",2.5));
    this.products.push(new Product(4,"Watch",3.5));
    this.products.push(new Product(5,"Laptop",3));
    this.products.push(new Product(6,"Charger",3.5));

  }

  getProducts() {
    return this.products;
  }

  getMaxSoldProduct() {
    let index = Math.round(Math.random()*5);
    return this.products[index];
  }
}
