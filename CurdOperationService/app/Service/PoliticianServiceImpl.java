package com.xworkz.CrudOperation.app.Service;

import com.xworkz.CrudOperation.app.repository.PoliticianRepository;

public class PoliticianServiceImpl implements PoliticianService {
	private PoliticianRepository politicianRepository;
	public PoliticianServiceImpl(PoliticianRepository politicianRepository) {
		this.politicianRepository=politicianRepository;
	}

	@Override
	public void validateAndRule(String name) {
		System.out.println("invoking validateAndRule in "+this.getClass().getSimpleName());
		if(name!=null &&!name.isEmpty() && name.length()>=3 &&  name.length()<=20)
		{
			System.out.println("PoliticianData is Valid");
			this.politicianRepository.rule(name);
		}
		else {
			System.out.println("PoliticianData is invalid");
		}
		
	}

}
