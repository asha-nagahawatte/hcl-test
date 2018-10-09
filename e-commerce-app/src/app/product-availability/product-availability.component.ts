import { Component, OnInit } from '@angular/core';
import { Product } from './product.model';
import { ProductAvailabilityService } from '../product-availability.service';


@Component({
  selector: 'app-product-availability',
  templateUrl: './product-availability.component.html',
  styleUrls: ['./product-availability.component.css']
})
export class ProductAvailabilityComponent implements OnInit {

  product : Product;
  response : any;
  productName : string;
  err : any;
  
 

  constructor(private productAvailService : ProductAvailabilityService) { }

  ngOnInit() {
    this.product = new Product('','','','','');
  }


  findProductAvailability(product : Product){
    
    this.productAvailService.findProductDetails(this.product).
    subscribe((response) => {
      this.response = response;
     }, err => this.response = err);
  }



  onSubmit(){
    console.log('this.product.productName : ' +this.product.productName)
    this.findProductAvailability(this.product)

   }

}
