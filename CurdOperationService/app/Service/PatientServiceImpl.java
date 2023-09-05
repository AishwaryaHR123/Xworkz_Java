package com.xworkz.CrudOperation.app.Service;

import com.xworkz.CrudOperation.app.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {
	private PatientRepository patientRepository;
	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository=patientRepository;
	}

	@Override
	public void validateAndCure(String patientName) {
		System.out.println("invoking validateAndCure in "+this.getClass().getSimpleName());
		if(patientName!=null &&!patientName.isEmpty() && patientName.length()>=3 &&  patientName.length()<=20)
		{
			System.out.println("PatientData is Valid");
			this.patientRepository.cure(patientName);
		}
		else {
			System.out.println("PatientData is invalid");
		}
		
	}

}
