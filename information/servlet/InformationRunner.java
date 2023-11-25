package com.xworkz.information.servlet;

import com.xworkz.information.dto.InformationDTO;
import com.xworkz.information.repository.InformationRepository;
import com.xworkz.information.repository.InformationRepositoryImpl;
import com.xworkz.information.service.InformationService;
import com.xworkz.information.service.InformationServiceImpl;

public class InformationRunner {

	public static void main(String[] args) {
		InformationRepository repository=new InformationRepositoryImpl();
		InformationService service=new InformationServiceImpl(repository);
		InformationDTO dto= new InformationDTO("1345A", "Aishwarya", "Gowda", "RESE", "aish@123", "Female", "344526781", "rajajinagar", "Bangalore", "Karnataka", "788990");
		boolean persisted = service.validateAndSave(dto);
		System.out.println("Persisted = " + persisted);

	}

}
