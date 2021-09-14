package com.spring.model;
import org.springframework.stereotype.Component;

//use appropriate annotation
@Component
public class Bill {
	
	private String invoiceId;
	private String customerName;
	private double milkQuantity;
	private String phoneNumber;
	private String milkType;
	private String paymentType;
	
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getMilkQuantity() {
		return milkQuantity;
	}
	public void setMilkQuantity(double milkQuantity) {
		this.milkQuantity = milkQuantity;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	

}
