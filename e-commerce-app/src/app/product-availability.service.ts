import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product-availability/product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductAvailabilityService {

  private baseUrl = 'http://localhost:8080/e-commerce-app/webapi/products';

  constructor(private http : HttpClient) { 

  }

  findProductDetails(product : Product) : Observable<any>{
    return this.http.get(this.baseUrl+'/'+product.productName)
  }

 
}
