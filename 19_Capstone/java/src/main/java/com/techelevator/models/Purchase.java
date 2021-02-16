package com.techelevator.models;

import java.math.BigDecimal;
import java.security.PublicKey;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Purchase 
{
	BigDecimal credit = BigDecimal.ZERO;
	int quantity;
	
	public static void Purchase()
	{
		
	}
		
	public void addMoney(BigDecimal moneyAmount)
	{
		credit = credit.add(moneyAmount);
	}
		
	public BigDecimal getCredit()
	{
		return this.credit;
	}
	
	public void subtractMoney(BigDecimal itemPrice)
	{
		credit = credit.subtract(itemPrice);
	}
	
	public void subtractOne(int isCurrentQuantity)
	{
		quantity = quantity - 1;
	}

//	public void subtractMoney(BigDecimal itemPrice) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}
