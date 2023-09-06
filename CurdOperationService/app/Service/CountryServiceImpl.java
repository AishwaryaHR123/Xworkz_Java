package com.xworkz.CurdOperationService.app.Service;

import com.xworkz.CurdOperationService.app.Repository.CountryRepository;

public class CountryServiceImpl implements CountryService {
	private CountryRepository countryRepository;

	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public boolean ValidateAndSave(String country) {
		System.out.println("invoking ValidateAndSave " + this.getClass().getSimpleName());
		if (country != null && !country.isEmpty() && country.length() >= 3 && country.length() <= 20) {
			System.out.println("Country is valid,stored in repo");
			if (!this.countryRepository.isExist(country)) {
				this.countryRepository.countryStore(country);
				return true;
			} else {
				System.err.println("Country Name " + country + " already exists,add another one");
			}
		} else {
			System.err.println("Country name " + country + " is invalid");
		}

		return false;
	}

}
