package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.PoliticianRepository;
import com.xworkz.CrudOperation.app.repository.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliticianRunner");
		PoliticianRepository politicianRepository = new PoliticianRepositoryImpl();
		politicianRepository.rule(2);
		politicianRepository.rule(7);
		politicianRepository.rule(8);
		politicianRepository.rule(5);
		politicianRepository.rule(6);
		politicianRepository.rule(4);
		politicianRepository.rule(10);
		politicianRepository.rule(3);
		politicianRepository.rule(1);
		politicianRepository.rule(9);

	}

}
