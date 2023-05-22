import { Component, OnInit } from '@angular/core';
import {ProductCategory} from "../../common/product-category";
import {ProductService} from "../../services/product.service";

@Component({
  selector: 'app-products-category-menu',
  templateUrl: './products-category-menu.component.html',
  styleUrls: ['./products-category-menu.component.css']
})
export class ProductsCategoryMenuComponent {

  productCategories: ProductCategory[] =[];

  constructor(private ProductService: ProductService) {
  }

  ngOnInit(){
    this.listProductCategories();
  }

  listProductCategories(){

    this.productService.getProductCategories().subscribe(
      data => {
        console.log('Product categories=' + JSON.stringify(data))
        this.productCategories = data;
      }
    );
  }
}
