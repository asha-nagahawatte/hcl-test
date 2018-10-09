package org.hcl.test.asha.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

import org.hcl.test.asha.exception.DataNotFoundException;
import org.hcl.test.asha.model.Product;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
	
	private static List<Product> products = new ArrayList<>();
	private static Map<String,Product> map= new HashMap<>();
	
	//Create Dummy Data 
	static {
		Product product1 = new Product("SamsungS8","Unlocked Mobile Phone","5Star","PHONES","www.dummy.com/samsungs8");
		Product product2 = new Product("AppleMac","Mac Book Pro","5Star","LAPTOPS","www.dummy.com/macbookpro");
		map.put("SamsungS8", product1);
		map.put("AppleMac", product2);
	}

	@GET
	@Path("/{productName}")
	public List<Product> getProducts(@PathParam("productName") String productName){
		List<Product> productList = new ArrayList<>();
		if(map.containsKey(productName)) {
			productList.add(map.get(productName));
			return productList;
		} else {
			return null;
		}
	
	}
}
