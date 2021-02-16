package com.techelevator.models;

import java.util.HashMap;
import java.util.Map;


/** 
 * Responsibilities:
 *      Track current inventory
 *      Add new inventory
 * 
 * Dependencies:
 *      Product
 *      FileProductLoader - this knows how to load all products from the file
 */
public class Inventory 
{
	private Map<String, Product> products = new HashMap<String, Product>();
	
	
	public Inventory()
	{
		loadInventory();
	}
	

    public void loadInventory()
    {
        // Inventory should NOT know how to read from a file
        // we will use the FileProductLoader to get the products
    	
    	FileProductLoader loader = new FileProductLoader();
    	products = loader.getProducts();
    }
    
    public Map<String, Product> getProducts()
    {
    	return products;
    }
    
}
