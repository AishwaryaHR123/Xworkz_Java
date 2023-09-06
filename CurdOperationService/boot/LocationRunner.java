package com.xworkz.CurdOperationService.boot;

import com.xworkz.CurdOperationService.app.Repository.LocationRepository;
import com.xworkz.CurdOperationService.app.Repository.LocationRepositoryImpl;
import com.xworkz.CurdOperationService.app.Service.LocationService;
import com.xworkz.CurdOperationService.app.Service.LocationServiceImpl;

public class LocationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LocationRunner");
		LocationRepository locationRepository=new LocationRepositoryImpl();
		LocationService locationService=new LocationServiceImpl(locationRepository);
		boolean saved=locationService.ValidateAndSave("Rajajinagar");
		System.out.println("Saved= "+saved);
		locationService.ValidateAndSave("Rajajinagar");
		locationService.ValidateAndSave("Vijayanagar");
		
		
	}

}
