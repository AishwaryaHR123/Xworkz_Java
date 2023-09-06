package com.xworkz.CurdOperationService.app.Service;

import com.xworkz.CurdOperationService.app.Repository.LocationRepository;

public class LocationServiceImpl implements LocationService {
	private LocationRepository locationRepository;
	public LocationServiceImpl( LocationRepository locationRepository) {
		this.locationRepository=locationRepository;
	}
	

	@Override
	public boolean ValidateAndSave(String location) {
		System.out.println("invoking ValidateAndSave " + this.getClass().getSimpleName());
		if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 20) {
			System.out.println("location is valid,stored in repo");
			if (!this.locationRepository.isExist(location)) {
				this.locationRepository.locationAndSave(location);
				return true;
			} else {
				System.err.println("Location Name " + location + " already exists,add another one");
			}
		} else {
			System.err.println("Location name " + location + " is invalid");
		}
		
		return false;
	}

}
