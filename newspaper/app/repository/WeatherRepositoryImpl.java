package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository {
	private WeatherDTO[] dtos=new WeatherDTO[TOTAL_DETAIL];
	private int position;

	@Override
	public void save(WeatherDTO dto) {
		System.out.println("invoking save in "+this.getClass().getSimpleName());
		if (position < TOTAL_DETAIL) {
			this.dtos[position] = dto;
			System.out.println(dto + "saved at position in " + this.position);
			this.position++;

		} else {
			System.err.println("Stored is full cannot save....");
		}
	}

}
