import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  url = 'http://localhost:8080/product';
  constructor(private http: HttpClient) { }
  product() {
    return this.http.get(this.url);
  }
  saveProduct(data:any) {
    return this.http.post(this.url,data)
  }
}
