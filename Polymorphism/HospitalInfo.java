package com.xworkz.Polymorphism;

public class HospitalInfo extends Hospital {
	@Override
	public void treatment() {
		System.out.println("HospitalInfo overrides Hospital");
		super.treatment();
	}

	@Override
	public void treatment(String hospitalName) {
		super.treatment(hospitalName);
	}

	@Override
	public void treatment(String hospitalName, int noOfDoctor) {
		super.treatment(hospitalName, noOfDoctor);
	}

	@Override
	public void treatment(String hospitalName, int noOfDoctor, String patientName) {
		super.treatment(hospitalName, noOfDoctor, patientName);
	}

	@Override
	public void treatment(String hospitalName, int noOfDoctor, String patientName, int noOfStaff) {
		super.treatment(hospitalName, noOfDoctor, patientName, noOfStaff);
	}

	@Override
	public void treatment(String hospitalName, int noOfDoctor, String patientName, int noOfStaff, boolean clean) {
		super.treatment(hospitalName, noOfDoctor, patientName, noOfStaff, clean);
	}

}
