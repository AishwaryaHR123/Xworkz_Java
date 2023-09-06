package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.PoliticianRepository;
import com.xworkz.CrudOperation.app.repository.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliticianRunner");
		PoliticianRepository politicianRepository = new PoliticianRepositoryImpl();
		politicianRepository.rule("Modi");
		politicianRepository.rule("Siddramaiah");
		politicianRepository.rule("DK Shivkumar");
		politicianRepository.rule("bommai");
		politicianRepository.rule("kumarswamy");
		politicianRepository.rule("devegowda");
		politicianRepository.rule("VinayKumar");
		politicianRepository.rule("Kulkarni");
		politicianRepository.rule("devendrappa");
		politicianRepository.rule("Acharaya");

	}

}
