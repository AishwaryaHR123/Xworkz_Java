package com.xworkz.country.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CountryDTO implements Serializable {
	private int id;
	private String name;
	private String capitalCity;
	private double population;
	private boolean independent;
	private LocalDate independenceDate;
	private int noOfStates;
	private String primaryReligion;
	private String nationalAnimal;
	private String nationalBird;
	private String nationalSport;
	private String primeMinisterName;
	public CountryDTO() {
	}
	public CountryDTO(int id, String name, String capitalCity, double population, boolean independent,
			LocalDate independenceDate, int noOfStates, String primaryReligion, String nationalAnimal,
			String nationalBird, String nationalSport, String primeMinisterName) {
		super();
		this.id = id;
		this.name = name;
		this.capitalCity = capitalCity;
		this.population = population;
		this.independent = independent;
		this.independenceDate = independenceDate;
		this.noOfStates = noOfStates;
		this.primaryReligion = primaryReligion;
		this.nationalAnimal = nationalAnimal;
		this.nationalBird = nationalBird;
		this.nationalSport = nationalSport;
		this.primeMinisterName = primeMinisterName;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public double getPopulation() {
		return population;
	}
	public boolean isIndependent() {
		return independent;
	}
	public LocalDate getIndependenceDate() {
		return independenceDate;
	}
	public int getNoOfStates() {
		return noOfStates;
	}
	public String getPrimaryReligion() {
		return primaryReligion;
	}
	public String getNationalAnimal() {
		return nationalAnimal;
	}
	public String getNationalBird() {
		return nationalBird;
	}
	public String getNationalSport() {
		return nationalSport;
	}
	public String getPrimeMinisterName() {
		return primeMinisterName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public void setIndependent(boolean independent) {
		this.independent = independent;
	}
	public void setIndependenceDate(LocalDate independenceDate) {
		this.independenceDate = independenceDate;
	}
	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}
	public void setPrimaryReligion(String primaryReligion) {
		this.primaryReligion = primaryReligion;
	}
	public void setNationalAnimal(String nationalAnimal) {
		this.nationalAnimal = nationalAnimal;
	}
	public void setNationalBird(String nationalBird) {
		this.nationalBird = nationalBird;
	}
	public void setNationalSport(String nationalSport) {
		this.nationalSport = nationalSport;
	}
	public void setPrimeMinisterName(String primeMinisterName) {
		this.primeMinisterName = primeMinisterName;
	}
	

}
