package com.xworkz.CrudOperation.app.repository;

public class PatientRepositoryImpl implements PatientRepository{
	private String[] patients=new String[TOTAL_PATIENTS];
	int position;
	@Override
	public void cure(String patientName) {
		System.out.println("invoking cure in PatientRepositoryImpl");
		if (position < TOTAL_PATIENTS) {
			this.patients[position] = patientName;
			System.out.println("Stored " + patientName + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
	}
	}
