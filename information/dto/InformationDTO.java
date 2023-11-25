package com.xworkz.information.dto;

import java.io.Serializable;

public class InformationDTO implements Serializable{
	private String slNo;
	private String fName;
	private String lName;
	private String mName;
	private String email;
	private String gender;
	private String contactNo;
	private String area;
	private String District;
	private String state;
	private String pinCode;
	public InformationDTO() {
	}
	public InformationDTO(String slNo, String fName, String lName, String mName, String email, String gender,
			String contactNo, String area, String district, String state, String pinCode) {
		super();
		this.slNo = slNo;
		this.fName = fName;
		this.lName = lName;
		this.mName = mName;
		this.email = email;
		this.gender = gender;
		this.contactNo = contactNo;
		this.area = area;
		District = district;
		this.state = state;
		this.pinCode = pinCode;
	}
	public String getSlNo() {
		return slNo;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getmName() {
		return mName;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public String getContactNo() {
		return contactNo;
	}
	public String getArea() {
		return area;
	}
	public String getDistrict() {
		return District;
	}
	public String getState() {
		return state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "InformationDTO [slNo=" + slNo + ", fName=" + fName + ", lName=" + lName + ", mName=" + mName
				+ ", email=" + email + ", gender=" + gender + ", contactNo=" + contactNo + ", area=" + area
				+ ", District=" + District + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
}