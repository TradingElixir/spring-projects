package com.spring.main;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;
import com.spring.config.ApplicationConfig;
import com.spring.service.BillService;


public class Driver {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		com.spring.service.BillService service=(BillService)ctx.getBean(BillService.class);
		
		System.out.println("enter the Invoice Id:");
		String invoiceId=in.nextLine();
		System.out.println("Enter the CustomerName:");
		String customerName=in.nextLine();
		System.out.println("enter the milk quantity");
		double milkQuantity=Double.parseDouble(in.nextLine());
		System.out.println("enter the Phone number");
		String phoneNumber=in.nextLine();
		System.out.println("enter the milktype(whole/skim/condensed");
		String milkType=in.nextLine();
		System.out.println("enter the payment type");
		String paymentType=in.nextLine();
		
		System.out.println("Bill amoount to be paid is rs:"+service.calculateTotalBillAmount(invoiceId,customerName, milkQuantity, phoneNumber, milkType, paymentType));
		
	}

}
