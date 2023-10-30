package com.xworkz.disease.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DiseaseDTO implements Serializable {
	private int id;
	private String diseaseName;
	private boolean isContagious;
	private float temperature;
	private int patientAge;
	private char bloodType;
	private long patientID;
	private double mortalityRate;
	private LocalDate vaccinationDate;
	private LocalDateTime admissionDateTime;
	public DiseaseDTO() {
	}
	public DiseaseDTO(int id, String diseaseName, boolean isContagious, float temperature, int patientAge,
			char bloodType, long patientID, double mortalityRate, LocalDate vaccinationDate,
			LocalDateTime admissionDateTime) {
		super();
		this.id = id;
		this.diseaseName = diseaseName;
		this.isContagious = isContagious;
		this.temperature = temperature;
		this.patientAge = patientAge;
		this.bloodType = bloodType;
		this.patientID = patientID;
		this.mortalityRate = mortalityRate;
		this.vaccinationDate = vaccinationDate;
		this.admissionDateTime = admissionDateTime;
	}
	public int getId() {
		return id;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public boolean isContagious() {
		return isContagious;
	}
	public float getTemperature() {
		return temperature;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public char getBloodType() {
		return bloodType;
	}
	public long getPatientID() {
		return patientID;
	}
	public double getMortalityRate() {
		return mortalityRate;
	}
	public LocalDate getVaccinationDate() {
		return vaccinationDate;
	}
	public LocalDateTime getAdmissionDateTime() {
		return admissionDateTime;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public void setContagious(boolean isContagious) {
		this.isContagious = isContagious;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public void setBloodType(char bloodType) {
		this.bloodType = bloodType;
	}
	public void setPatientID(long patientID) {
		this.patientID = patientID;
	}
	public void setMortalityRate(double mortalityRate) {
		this.mortalityRate = mortalityRate;
	}
	public void setVaccinationDate(LocalDate vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}
	public void setAdmissionDateTime(LocalDateTime admissionDateTime) {
		this.admissionDateTime = admissionDateTime;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiseaseDTO other = (DiseaseDTO) obj;
		if (admissionDateTime == null) {
			if (other.admissionDateTime != null)
				return false;
		} else if (!admissionDateTime.equals(other.admissionDateTime))
			return false;
		if (bloodType != other.bloodType)
			return false;
		if (diseaseName == null) {
			if (other.diseaseName != null)
				return false;
		} else if (!diseaseName.equals(other.diseaseName))
			return false;
		if (id != other.id)
			return false;
		if (isContagious != other.isContagious)
			return false;
		if (Double.doubleToLongBits(mortalityRate) != Double.doubleToLongBits(other.mortalityRate))
			return false;
		if (patientAge != other.patientAge)
			return false;
		if (patientID != other.patientID)
			return false;
		if (Float.floatToIntBits(temperature) != Float.floatToIntBits(other.temperature))
			return false;
		if (vaccinationDate == null) {
			if (other.vaccinationDate != null)
				return false;
		} else if (!vaccinationDate.equals(other.vaccinationDate))
			return false;
		return true;
	}
	
	

}
