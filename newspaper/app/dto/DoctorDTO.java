package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class DoctorDTO implements Serializable{
	private String doctorName;
	private int age;
	private String location;
	private int experience;
	public DoctorDTO() {
	}
	public DoctorDTO(String doctorName, int age, String location, int experience) {
		super();
		this.doctorName = doctorName;
		this.age = age;
		this.location = location;
		this.experience = experience;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "DoctorDTO [doctorName=" + doctorName + ", age=" + age + ", location=" + location + ", experience="
				+ experience + "]";
	}

}
