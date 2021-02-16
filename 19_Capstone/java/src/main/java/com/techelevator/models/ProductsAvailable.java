package com.techelevator.models;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

import com.techelevator.models.Product;

/**
 * Responsibilities:
 *      Add product to cart
 *      Calculate the cart total price
 * 
 * Dependencies:
 *      Product
 */
public class ProductsAvailable 
{
	Map<Product, Integer> cart = new TreeMap<Product, Integer>();
	
	public void remove(Product product)
	{
		// add product or update quantity
		cart.remove(product, 1);
	}
	
	public BigDecimal getCartTotal()
	{
		return BigDecimal.ONE;
	}
    
}
