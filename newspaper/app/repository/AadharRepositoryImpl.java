package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {
	private AadharDTO[] dtos=new AadharDTO[TOTAL_DETAILS];
	private int position;
	
	@Override
	public void save(AadharDTO dto) {
		System.out.println("invoking save in "+this.getClass().getSimpleName());
		if(position<TOTAL_DETAILS)
		{
			this.dtos[position]=dto;
			System.out.println(dto +"saved at position in " +this.position);
			this.position++;
		}
		else {
			System.err.println("Stored is full cannot save....");
		}
		
	}

}
