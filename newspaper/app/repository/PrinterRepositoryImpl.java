package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {
	private PrinterDTO[] dtos = new PrinterDTO[TOTAL_PRINTER];
	private int position;

	@Override
	public void save(PrinterDTO dto) {
		System.out.println("invoking save in " + this.getClass().getSimpleName());
		if (position < TOTAL_PRINTER) {
			this.dtos[position] = dto;
			System.out.println(dto + "saved at position in " + this.position);
			this.position++;

		} else {
			System.err.println("Stored is full cannot save....");
		}
	}

}
