package com.spring.model;

public class Hospital {
	
	private double bedCount;
	private double patientCount;
	private String treatmentType;
	
	public double getBedCount() {
		return bedCount;
	}
	public void setBedCount(double bedCount) {
		this.bedCount = bedCount;
	}
	public double getPatientCount() {
		return patientCount;
	}
	public void setPatientCount(double patientCount) {
		this.patientCount = patientCount;
	}
	public String getTreatmentType() {
		return treatmentType;
	}
	public void setTreatmentType(String treatmentType) {
		this.treatmentType = treatmentType;
	}
	
	

}
