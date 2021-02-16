package com.techelevator.models;

import java.math.BigDecimal;


/**
 * Responsibilities:
 *      Knows the id, name and price of the product
 */
public class Product 
{
    private String id;
    private String name;
    private static BigDecimal price;
    private String category;
    private int quantity;
    
	public Product(String id, String name, BigDecimal price, String category)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = 5;
	}
	
	public static BigDecimal getPrice(String pickItem) 
	{

		return price;
	}
	
	public int removeItem()
	{
		return quantity--;
	}
	
	public String getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public static BigDecimal getPrice()
	{
		return price;
	}
	public String getCategory()
	{
		return category;
	}
	public int getQuantity()
	{
		return 5;
	}
	
		
	@Override
	public String toString()
	{
		return id + ") " + name + " - $" + price + "  " + quantity;
	}

	
    
}
