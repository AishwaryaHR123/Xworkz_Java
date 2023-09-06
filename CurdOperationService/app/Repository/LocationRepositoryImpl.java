package com.xworkz.CurdOperationService.app.Repository;

public class LocationRepositoryImpl implements LocationRepository {
	private String[] locations = new String[TOTAL_LOCATION];
	private int position = 0;

	@Override
	public void locationAndSave(String name) {
		System.out.println("invoking locationAndSave "+this.getClass().getSimpleName());
		if (position < TOTAL_LOCATION) {
			this.locations[position] = name;
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
			String temp = this.locations[index];

			if (temp != null && temp.equals(name)) {
				System.out.println("Location already Exist");
				return true;
			}
		}
		return LocationRepository.super.isExist(name);
	}

}
