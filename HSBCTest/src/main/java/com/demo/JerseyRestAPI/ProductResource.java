package com.demo.JerseyRestAPI;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("products")
public class ProductResource {

	ProductRepository repo = new ProductRepository();

	//Fetching product and category from Products table
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("productAndCategory")
	public List<Products> getProductAndCategory(){
		return repo.getProductAndCategory();
	}

	//Fetching product from Product table by category
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("productByCategory")
	public List<Products> getProductByCategory(){
		return repo.getProductByCategory();
	}

	//Fetching product from Products table by company
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("productByCompany")
	public List<Products> getProductByCompany(){
		return repo.getProductByCompany();
	}

	//Fetching price from Product table by category
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("discountByCategory")
	public List<Products> getDiscountByCategory(){
		return repo.getDiscountByCategory();
	}
}
