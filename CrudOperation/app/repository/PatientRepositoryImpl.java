package com.xworkz.CrudOperation.app.repository;

public class PatientRepositoryImpl implements PatientRepository{
	private int[] patients=new int[TOTAL_PATIENTS];
	int position;
	@Override
	public void cure(int age) {
		System.out.println("invoking cure in PatientRepositoryImpl");
		if (position < TOTAL_PATIENTS) {
			this.patients[position] = age;
			System.out.println("Stored " + age + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
	}
	}
