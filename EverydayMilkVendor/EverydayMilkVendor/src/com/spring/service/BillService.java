package com.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.bo.BillBO;
import com.spring.config.ApplicationConfig;
import com.spring.model.Bill;

//use appropriate annotation
@Service
public class BillService {
	
	private BillBO billBoObj;

	public BillBO getBillBoObj() {
		return billBoObj;
	}

	public void setBillBoObj(BillBO billBoObj) {
		this.billBoObj = billBoObj;
	}

	// use appropriate annotation
	@Autowired
	public BillService(BillBO billBoObj) {
		super();
		this.billBoObj = billBoObj;
	}
	
	/* This method has to assign the values of invoiceId, customerName, milkQuantity, phoneNumber, milkType and paymentType to the Bill object sObj 
	and invoke calculateTotalBillAmount method in BillBO class by passing Bill object sObj */
	
	public double calculateTotalBillAmount (String invoiceId, String customerName, double milkQuantity, String phoneNumber,String milkType, String paymentType) 
	{
		double billAmount=0.0;
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Bill sObj=(Bill)ctx.getBean("bill");
		sObj.setInvoiceId(invoiceId);
		sObj.setCustomerName(customerName);
		sObj.setMilkQuantity(milkQuantity);
		sObj.setPhoneNumber(phoneNumber);
		sObj.setMilkType(milkType);
		sObj.setPaymentType(paymentType);
		
		billAmount=billBoObj.calculateTotalBillAmount(sObj);
		return billAmount;
	}
	

}
