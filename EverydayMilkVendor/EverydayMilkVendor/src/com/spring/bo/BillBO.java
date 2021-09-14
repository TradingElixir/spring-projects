package com.spring.bo;
import org.springframework.stereotype.Component;
import com.spring.model.Bill;

//use appropriate annotation
@Component
public class BillBO {
	
	/* This method should calculate the total bill amount and return the same to the BillService class */

	public double calculateTotalBillAmount (Bill bObj)
	{
		double billAmount=0.0;
		//fill the code
		String milkType=bObj.getMilkType();
		double price=0;
		switch(milkType) {
		case"Whole":price=50.0;
			break;
		case"Skim":price=100.0;
		break;
		case"Condensed":price=200.0;
		break;
		}
		billAmount=price*bObj.getMilkQuantity();
		
		return billAmount;
	}
}
