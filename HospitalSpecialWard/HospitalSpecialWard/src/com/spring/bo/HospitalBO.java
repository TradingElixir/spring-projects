package com.spring.bo;

import com.spring.model.Hospital;

public class HospitalBO {

	/* This method is to calculate admitted patient ratio. Get the patientCount and bedCount using Hospital object 
		and calculate the ratio. */ 

	
	public double calculateAdmittedPatientRatio (Hospital hObj) 
	{
		double ratio=0.0;
		double bedcount=hObj.getBedCount();
		double patientcount=hObj.getPatientCount();
		ratio=(patientcount/bedcount*100);
		return ratio;
	}

}
