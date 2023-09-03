package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.PatientRepository;
import com.xworkz.CrudOperation.app.repository.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PatientRunner");
		PatientRepository patientRepository=new PatientRepositoryImpl();
		patientRepository.cure(21);
		patientRepository.cure(19);
		patientRepository.cure(17);
		patientRepository.cure(16);
		patientRepository.cure(15);
		patientRepository.cure(30);
		patientRepository.cure(45);
		patientRepository.cure(37);
		patientRepository.cure(23);
		patientRepository.cure(10);



	}

}
