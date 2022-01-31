import { Component, Input, OnInit } from "@angular/core";
import { Product } from "./product";
import { ProductService } from "./product.service";

@Component({
    selector: 'sw-product-list',
    templateUrl: 'product-list.component.html'
})
export class ProductListComponent implements OnInit {

    products:Array<Product> = new Array<Product>();

    @Input()
    rating:number = 1;
    constructor(private productService:ProductService) {

    }
    ngOnInit() {
        this.products = this.productService.getProducts();
    }

}