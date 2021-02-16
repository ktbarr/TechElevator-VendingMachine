package com.techelevator.application;

import java.math.BigDecimal;
import java.util.Map;
import com.techelevator.models.FileProductLoader;
import com.techelevator.models.Inventory;
import com.techelevator.models.Product;
import com.techelevator.models.Purchase;
//import com.techelevator.models.exceptions.InsuficientFundsException;
import com.techelevator.ui.UserInput;
//import com.techelevator.models.ShoppingCart;
//import com.techelevator.models.file_io.Logger;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
	private FileProductLoader fileList = new FileProductLoader();
	private Inventory inventory = new Inventory();
	private Purchase wallet = new Purchase();
    //private Logger errorLogger = new Logger("errors");
    
	
    public void run()
    {
        while(true)
        {
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                // display the vending machine slots
            	viewInventory();
            }
            else if(choice.equals("purchase"))
            {
                purchase();
            }
            else if(choice.equals("exit"))
            {
                exit();
                break;
            }
            else 
            {
            	
            }
        }
     }
    public void viewInventory()
    {
    	// show the products
    	UserOutput.displayInventory(inventory.getProducts());
    	
		}
    
    public void purchase()
    {
    	while (true)
    	{
    		
    		String purchaseChoice = UserInput.getPurchaseOption(wallet.getCredit());
    	
    		if(purchaseChoice.equals("feed"))
    			{
    				BigDecimal money = UserInput.getMoney(); 
    				wallet.addMoney(money);
    			}
    		else if(purchaseChoice.equals("select"))
			{
				// display inventory and prompt the user, what product they want to buy
    			// make sure there is enough money, get product based on id
    			// if there is enough money (update the wallet and update product quantity
    			// if there is not enough money display to the user an error message
    			
    			UserOutput.displayInventory(inventory.getProducts());
    			String pickItem = UserInput.getSelectedProduct();
    			BigDecimal currentMoney = wallet.getCredit();
    			BigDecimal itemPrice = Product.getPrice(pickItem);  // check to see if the wrong ID is selected, may cause error
    			Map product = fileList.getProducts();
    			int quantity = 5;
    			
    			
    			BigDecimal change = currentMoney.subtract(itemPrice);
    			
    			if(change.compareTo(BigDecimal.ZERO) < 0 )
       			{
    				//throw new InsuficientFundsException("The provided payment is not sufficient.", cartTotal, paymentAmount);
    				UserOutput.insuficientFunds();
       	        }
    			else if (!product.containsKey(pickItem)) 
    			{
    				UserOutput.productDoesNotExist();
				}
    			else if(quantity <= 0)
    			{
    				UserOutput.outOfStock();
    			}
    			
			}
    		else if(purchaseChoice.equals("finish"))
    		{
    			// Calculate and display the change to the user
    			
    			BigDecimal change = wallet.getCredit();
    			
    			
    			change = change.divide(change, 4);
    			
//    			change = java.math.BigDecimal.divide(change, 4);
//    			
//    			
//    			change = (int)(Math.ceil(changeDue*100));
//    			
//    		    int dollars = Math.round((int)change/100);
//    		    change=change%100;
//    		    int quarters = Math.round((int)change/25);
//    		    change=change%25;
//    		    int dimes = Math.round((int)change/10);
//    		    change=change%10;
//    		    int nickels = Math.round((int)change/5);
//    		    change=change%5;
//    		    int pennies = Math.round((int)change/1);
//    			
//    			
    			
//    		    currentMoney.java.math.BigDecimal.intValue();
    		    
    		    
    		    
    		    
//    			int quarters = currentMoney / 25;
//    			
//    			currentMoney = currentMoney % 25;
//    		    
//    		    int dimes = currentMoney/10);
//    		    change=change%10;
//    		    
//    		    int nickels = change/5);
//    		    change=change%5;
    			
    			
    			
    			//UserOutput.finishTransaction(int nickels, int dimes, int quarters);
    			
    			break;
    		}
    	}
    	
    }
         
    public void exit() 
    {
    	
    }
    
}
