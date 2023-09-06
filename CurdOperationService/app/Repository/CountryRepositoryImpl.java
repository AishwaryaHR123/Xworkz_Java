package com.xworkz.CurdOperationService.app.Repository;

public class CountryRepositoryImpl implements CountryRepository {
	private String[] countries = new String[TOTAL_COUNTRY];
	private int position = 0;

	@Override
	public void countryStore(String name) {
		System.out.println("invoking CountryStore in " + this.getClass().getSimpleName());
		if (position < TOTAL_COUNTRY) {
			this.countries[position] = name;
			System.out.println("Stored " + name + " position in " + this.position);
			this.position++;
		} 
		else {
			System.err.println("Position is full unable to save");
		}

	}

	@Override
	public boolean isExist(String name) {
		for (int index = 0; index < this.position; index++) {
			String temp = this.countries[index];

			if (temp != null && temp.equals(name)) {
				System.out.println("country already Exist");
				return true;
			}
		}
		return CountryRepository.super.isExist(name);
	}

}
