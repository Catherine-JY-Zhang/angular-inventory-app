import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ProductService } from './product.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = '..............';
  uhhIdk = 'our';
posts:any [] = [];
product: any;
  constructor(private productData: ProductService){
    this.productData.product().subscribe((data)=>{
      this.product = data;
    })
  }


  loadPosts(){
    this.productData.product()
    .subscribe((response : any) => {
      this.posts = response;
    });
  }

  getProductFormData(data:any){
    console.warn(data);
    this.productData.saveProduct(data).subscribe((result)=>{
      console.warn(result)
    })
  }

}
