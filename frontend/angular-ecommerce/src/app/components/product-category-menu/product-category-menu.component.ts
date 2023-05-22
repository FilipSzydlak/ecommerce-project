import { Component, OnInit } from '@angular/core';
import {ProductCategory} from "../../common/product-category";
import {ProductService} from "../../services/product.service";

@Component({
  selector: 'app-product-category-menu',
  templateUrl: './product-category-menu.component.html',
  styleUrls: ['./product-category-menu.component.css']
})
export class ProductCategoryMenuComponent {

  productCategories: ProductCategory[] =[];

  constructor(private ProductService: ProductService) {
  }

  ngOnInit(){
    this.listProductCategories();
  }

  listProductCategories(){

    this.ProductService.getProductCategories().subscribe(
      data => {
        console.log('Product categories=' + JSON.stringify(data))
        this.productCategories = data;
      }
    );
  }
}
