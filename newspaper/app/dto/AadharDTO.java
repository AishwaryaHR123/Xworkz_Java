package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable{
	private int aadharNo;
	private String name;
	private String gender;
	private long mobileNumber;
	public AadharDTO() {
		
	}
	public AadharDTO(int aadharNo, String name, String gender, long mobileNumber) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "AadharDTO [aadharNo=" + aadharNo + ", name=" + name + ", gender=" + gender + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	

}
