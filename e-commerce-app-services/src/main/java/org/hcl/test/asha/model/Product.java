package org.hcl.test.asha.model;

public class Product {
	
	private String productName;
	private String productDescription;
	private String productRating;
	private String productCateogry;
	private String productImage;
	
	public Product() {
		
	}
	
	public Product(String productName, 
				   String productDescription, 
				   String productRating, 
				   String productCateogry,
				   String productImage
				   ) {
		this.productName=productName;
		this.productDescription=productDescription;
		this.productRating=productRating;
		this.productCateogry=productCateogry;
		this.productImage=productImage;
		
	}
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductRating() {
		return productRating;
	}
	public void setProductRating(String productRating) {
		this.productRating = productRating;
	}
	public String getProductCateogry() {
		return productCateogry;
	}
	public void setProductCateogry(String productCateogry) {
		this.productCateogry = productCateogry;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

}
