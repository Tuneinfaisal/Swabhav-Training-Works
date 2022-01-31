import React from "react";
import { Product } from "./Product";

export class ProductService {

    products = new Array();
    products = new Product();

    constructor() {
        this.products.push(new Product(1,"books"));
        this.products.push(new Product(2,"Pen"));
        this.products.push(new Product(3,"Pencil"));
        this.products.push(new Product(4,"Watch"));
        this.products.push(new Product(5,"Phone"));
    }

    getProduct() {
        return this.products;
    }

    getMaxSoldProduct() {
        let index = Math.round(Math.random()*4);
        return this.products[index];
    }
}