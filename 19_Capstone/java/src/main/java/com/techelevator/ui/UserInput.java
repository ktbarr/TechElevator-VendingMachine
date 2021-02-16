package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput 
{
private static Scanner scanner = new Scanner(System.in);
	
	public static String getHomeScreenOption()
	{
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();

		System.out.println("1) Display Vending machine Items");
		System.out.println("2) Purchase");
		System.out.println("3) Exit");
		
		System.out.println();
		System.out.print("Please select an option: ");
		
		String selectedOption = scanner.nextLine();
		String option = selectedOption.trim().toLowerCase();
		
		if(option.equals("1"))
		{
			return "display";
		}
		else if(option.equals("2"))
		{
			return "purchase";
		}
		else if(option.equals("3"))
		{
			return "exit";
		}
		else
		{
			return "";
		}
		
	}
	
	public static String getPurchaseOption(BigDecimal currentMoney)
	{
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();

		System.out.println("1) Feed money");
		System.out.println("2) Select Product");
		System.out.println("3) Finish Transaction");
		
		System.out.println();
		System.out.println("Current credit available:   " + currentMoney);
		
		
		System.out.println();
		System.out.print("Please select an option: ");
		
		String selectedOption = scanner.nextLine();
		String option = selectedOption.trim().toLowerCase();
		
		if(option.equals("1"))
		{
			return "feed";
		}
		else if(option.equals("2"))
		{
			return "select";
		}
		else if(option.equals("3"))
		{
			return "finish";
		}
		else
		{
			return "";
		}
		
	}
	
	public static BigDecimal getMoney()
	{
		System.out.print("Please enter the amount of money you want to add. ");
		String enteredAmount = scanner.nextLine();
		BigDecimal newMoney = new BigDecimal(enteredAmount);
		return newMoney;
	}
	
  
	public static String getSelectedProduct()
	{
		System.out.print("Which product do you want? ");
		String productId = scanner.nextLine();
		
		
		
		
		return productId.trim();
	}
	
	

}
