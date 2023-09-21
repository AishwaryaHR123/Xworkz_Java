package com.xworkz.crudoperationn.app.repository;

import com.xworkz.crudoperationn.dto.MetroDTO;

public class MetroRepositoryImpl implements MetroRepository {
	private MetroDTO[] dtos = new MetroDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(MetroDTO dto) {
		System.out.println("invoking save in " + this.getClass().getSimpleName());
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + "saved at position " + this.position);
			this.position++;
		} else {
			System.err.println("position is full unable to save.....");
		}

	}

	@Override
	public boolean isExist(MetroDTO dto) {
		System.out.println("running isExist in " + this.getClass().getSimpleName());
		for (int index = 0; index < this.position; index++) {
			MetroDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("dto is already exists");
				return true;
			}
		}
		return MetroRepository.super.isExist(dto);
	}

	@Override
	public MetroDTO findByLanguage(String name) {
		System.out.println("Running findByLangauge, arg passed " + name);
		System.out.println("Current Position " + this.position);
		for (int index = 0; index < this.position; index++) {
			MetroDTO dto = this.dtos[index];
			if (dto.getLanguage().equals(name)) {
				System.out.println("dto found with name");
				return dto;
			}

		}

		return MetroRepository.super.findByLanguage(name);
	}

}
