package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.PatientRepository;
import com.xworkz.CrudOperation.app.repository.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PatientRunner");
		PatientRepository patientRepository=new PatientRepositoryImpl();
		patientRepository.cure("Aishwarya");
		patientRepository.cure("Anusha");
		patientRepository.cure("Mounika");
		patientRepository.cure("pooja");
		patientRepository.cure("Sushama");
		patientRepository.cure("Paavani");
		patientRepository.cure("Punith");
		patientRepository.cure("Rohith");
		patientRepository.cure("Krishna");
		patientRepository.cure("Harsha");



	}

}
