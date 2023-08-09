package com.xworkz.Polymorphism;

public class ZooInfo extends Zoo {
	@Override
	public void conserve() {
		System.out.println("ZooInfo overrides Zoo");
		super.conserve();
	}

	@Override
	public void conserve(String zooName) {
		super.conserve(zooName);
	}

	@Override
	public void conserve(String zooName, String location) {
		super.conserve(zooName, location);
	}

	@Override
	public void conserve(String zooName, String location, double ticket) {
		super.conserve(zooName, location, ticket);
	}

	@Override
	public void conserve(String zooName, String location, double ticket, int since) {
		super.conserve(zooName, location, ticket, since);
	}

	@Override
	public void conserve(String zooName, String location, double ticket, int since, int noOfAnimal) {
		super.conserve(zooName, location, ticket, since, noOfAnimal);
	}

}
