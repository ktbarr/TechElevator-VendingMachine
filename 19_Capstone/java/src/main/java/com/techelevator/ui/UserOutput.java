package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.techelevator.application.VendingMachine;
import com.techelevator.models.Inventory;
import com.techelevator.models.Product;
import com.techelevator.models.Purchase;


/**
 * Responsibilities:
 *      This class should handle formatting and displaying ALL messages to the user
 * 
 * Dependencies:
 *      None
 */
public class UserOutput 
{
	
	public static void displayInventory(Map<String, Product> inventory)
	{
		System.out.println();
		System.out.println("*****************");
		System.out.println("    Products");
		System.out.println("*****************");
		System.out.println();
		
		for (Map.Entry<String, Product> product : inventory.entrySet()) 
		{
			System.out.println(product.toString());
			//System.out.println(product.toString());
		}
		System.out.println();
		
	}
	public static void insuficientFunds()
	{
		System.out.println("The provided payment is not sufficient.");
	}
	public static void productDoesNotExist()
	{
		System.out.println("Selected product does not exist!");
	}
	public static void outOfStock()
	{
		System.out.println("SOLD OUT");
	}
	public static void finishedTransaction()
	{
//		System.out.println("Quarters: " + quarters);
//	    System.out.println("Dimes: " + dimes);
//	    System.out.println("Nickels: " + nickels);
//	    System.out.println(" ");
	}
	
	
	
	
}
