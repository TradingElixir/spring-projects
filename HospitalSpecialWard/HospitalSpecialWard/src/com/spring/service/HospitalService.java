package com.spring.service;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bo.HospitalBO;
import com.spring.model.Hospital;
import com.spring.exception.InvalidBedCountException;


public class HospitalService {
	
	private HospitalBO hospitalBoObj;

	public HospitalBO getHospitalBoObj() {
		return hospitalBoObj;
	}

	public void setHospitalBoObj(HospitalBO hospitalBoObj) {
		this.hospitalBoObj = hospitalBoObj;
	}

	public HospitalService(HospitalBO hospitalBoObj) {
		super();
		this.hospitalBoObj = hospitalBoObj;
	}

	/* This method is to check whether the bedCount is greater than patientCount, if yes assign the values of bedCount, patientCount and treatmentType to the Hospital object 
		and invoke the calculateAdmittedPatientRatio method in HospitalBO class to calculate the ratio,
		if bedCount is less than patientCount throw an exception with the message "Invalid Bed Count" */

	public double calculateAdmittedPatientRatio (double bedCount, double patientCount, String treatmentType) throws InvalidBedCountException 
	{
		double ratio=0.0;
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Hospital cObj=(Hospital)context.getBean("hospital");
		// fill the code
		cObj.setBedCount(bedCount);
		cObj.setPatientCount(patientCount);
		cObj.setTreatmentType(treatmentType);
		
		if(bedCount<patientCount) {
			throw new InvalidBedCountException("Invalid bed count");
			
		}else
		{
			ratio=hospitalBoObj.calculateAdmittedPatientRatio(cObj);
		}
		return ratio;
	}

}
