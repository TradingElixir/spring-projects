package com.spring.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

import java.util.Scanner;
import com.spring.exception.InvalidBedCountException;
import com.spring.service.HospitalService;


public class Driver {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		HospitalService hObj=(HospitalService)context.getBean("service");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bed Count");
		double Bcount=sc.nextDouble();
		System.out.println("Enter the patient Count");
		double pcount=sc.nextDouble();
		System.out.println("Enter the treatment type");
		String type=sc.next();
		
		try {
			System.out.println("ratio is:"+ hObj.calculateAdmittedPatientRatio(Bcount,pcount,type));
			
		}catch(InvalidBedCountException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
