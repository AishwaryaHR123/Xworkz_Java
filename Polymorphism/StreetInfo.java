package com.xworkz.Polymorphism;

public class StreetInfo extends Street {
	@Override
	public void transportation() {
		System.out.println("StreetInfo overrides Street");
		super.transportation();
	}

	@Override
	public void transportation(String name) {
		super.transportation(name);
	}

	@Override
	public void transportation(String name, boolean parkingSpace) {
		super.transportation(name, parkingSpace);
	}

	@Override
	public void transportation(String name, boolean parkingSpace, String landUse) {
		super.transportation(name, parkingSpace, landUse);
	}

	@Override
	public void transportation(String name, boolean parkingSpace, String landUse, int noOfBuilding) {
		super.transportation(name, parkingSpace, landUse, noOfBuilding);
	}

	@Override
	public void transportation(String name, boolean parkingSpace, String landUse, int noOfBuilding, String location) {
		super.transportation(name, parkingSpace, landUse, noOfBuilding, location);
	}

}
