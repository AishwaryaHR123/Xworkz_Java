package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.repository.AadharRepository;
import com.xworkz.newspaper.app.repository.AadharRepositoryImpl;
import com.xworkz.newspaper.app.service.AadharService;
import com.xworkz.newspaper.app.service.AadharServiceImpl;

public class AadharRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in AadharRunner ");
		AadharRepository aadharRepository=new AadharRepositoryImpl();
		AadharService aadharService=new AadharServiceImpl(aadharRepository);
		AadharDTO dto=new AadharDTO(725546231, "Aishwarya", "female", 9591404128l);
		boolean persisted=aadharService.validateAndSave(dto);
		System.out.println("persisted= "+persisted);
	}

}
