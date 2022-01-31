import { Component, OnInit } from "@angular/core";
import { Product } from "./product";
import { ProductService } from "./product.service";

@Component({
    selector: 'sw-product-item',
    template: `
        <div class="mt-4 p-5 bg-primary text-white rounded">
            <h1>Product Item</h1>
            <h2>{{product.id}} - {{product.name}}</h2>
            <span class="btn btn-danger">Click</span>
        </div>
    `
})
export class ProductItemComponent implements OnInit {

    product:Product = new Product(0,"",0);

    constructor(private productService:ProductService) {

    }
    ngOnInit() {
        this.product = this.productService.getMaxSoldProduct();
    }

}