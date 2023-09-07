package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.DoctorDTO;

public class DoctorRepositoryImpl implements DoctorRepository {
	private DoctorDTO[] dtos=new DoctorDTO[TOTAL_DOCTOR];
	private int position;

	@Override
	public void save(DoctorDTO dto) {
		System.out.println("invoking DoctorDTO in "+this.getClass().getSimpleName());
		if(position<TOTAL_DOCTOR)
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
