package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.PatientService;
import com.xworkz.CrudOperation.app.Service.PatientServiceImpl;
import com.xworkz.CrudOperation.app.Service.PoliticianService;
import com.xworkz.CrudOperation.app.repository.PatientRepository;
import com.xworkz.CrudOperation.app.repository.PatientRepositoryImpl;

public class PatientServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PatientServiceRunner");
		PatientRepository patientRepository=new PatientRepositoryImpl();
		PatientService patientService=new PatientServiceImpl(patientRepository);
		patientService.validateAndCure("Aishwarya");

	}

}
