package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.PoliticianService;
import com.xworkz.CrudOperation.app.Service.PoliticianServiceImpl;
import com.xworkz.CrudOperation.app.repository.PoliticianRepository;
import com.xworkz.CrudOperation.app.repository.PoliticianRepositoryImpl;

public class PoliticianServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliticianServiceRunner");
		PoliticianRepository politicianRepository=new PoliticianRepositoryImpl();
		PoliticianService politicianService=new PoliticianServiceImpl(politicianRepository);
		politicianService.validateAndRule("Modi");
	}

}
