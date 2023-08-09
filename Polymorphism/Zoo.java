package com.xworkz.Polymorphism;

public class Zoo {
	public void conserve() {
		System.out.println("invoking no-args in Conserve");
	}

	public void conserve(String zooName) {
		System.out.println("invoking String in Conserve");
	}

	public void conserve(String zooName, String location) {
		System.out.println("invoking String,String in Conserve");
	}

	public void conserve(String zooName, String location, double ticket) {
		System.out.println("invoking String,String,double in Conserve");
	}

	public void conserve(String zooName, String location, double ticket, int since) {
		System.out.println("invoking String,String,double,int in Conserve");
	}

	public void conserve(String zooName, String location, double ticket, int since, int noOfAnimal) {
		System.out.println("invoking String,String,double,int,int in Conserve");
	}

}
