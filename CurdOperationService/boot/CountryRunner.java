package com.xworkz.CurdOperationService.boot;

import com.xworkz.CurdOperationService.app.Repository.CountryRepository;
import com.xworkz.CurdOperationService.app.Repository.CountryRepositoryImpl;
import com.xworkz.CurdOperationService.app.Service.CountryService;
import com.xworkz.CurdOperationService.app.Service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CountryRunner");
		CountryRepository countryRepository=new CountryRepositoryImpl();
		CountryService countryService=new CountryServiceImpl(countryRepository);
		boolean saved=countryService.ValidateAndSave("India");
		System.out.println("Saved= "+saved);
		countryService.ValidateAndSave("India");
		countryService.ValidateAndSave("Australia");

		
		
	}

}
