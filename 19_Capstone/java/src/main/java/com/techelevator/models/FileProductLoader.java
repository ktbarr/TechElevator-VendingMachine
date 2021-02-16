package com.techelevator.models;


import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.models.Product;

/**
 * Responsibilities:
 *      Read a txt/csv file and convert each line to a product
 *      returns a list of all products found in the file
 * 
 * Dependencies:
 *      Product
 */
public class FileProductLoader 
{
	
	public Map<String, Product> getProducts()
	{
		Map<String, Product> products = new HashMap<String, Product>();
		
		File productsPath = new File("data/vendingMachine.csv");		
		try(Scanner fileScanner = new Scanner(productsPath))
		{
			
			//loop and add each product to the list
			while(fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();
				// create the product
				String[] parts = line.split("\\|");
				
				String id = parts[0];
				String name = parts[1];
				BigDecimal price = new BigDecimal(parts[2]);
				String category = parts[3];
				
				Product product = new Product(id, name, price, category);
								
				// add it to the list
				products.put(id, product);
			}
		}
		catch(Exception ex)
		{
			
		}
		
		return products;
	}
    
}
