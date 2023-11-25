package com.xworkz.information.repository;

import com.xworkz.information.dto.InformationDTO;

public class InformationRepositoryImpl implements InformationRepository{
	private InformationDTO[] dtos=new InformationDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(InformationDTO dto) {
		System.out.println("invoking save in " + this.getClass().getSimpleName());
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + "saved at position " + this.position);
			this.position++;
		} else {
			System.err.println("position is full unable to save.....");
		}

	}
	
		
	}


