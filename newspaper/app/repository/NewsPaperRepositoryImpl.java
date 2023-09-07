package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;

public class NewsPaperRepositoryImpl implements NewsPaperRepository {
	private NewsPaperDTO[] dtos=new NewsPaperDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(NewsPaperDTO dto) {
		System.out.println("invoking save in "+this.getClass().getSimpleName());
		if(position<TOTAL_ITEMS)
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
