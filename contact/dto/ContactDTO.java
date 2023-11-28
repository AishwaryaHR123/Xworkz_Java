package com.xworkz.contact.dto;

import java.io.Serializable;

public class ContactDTO implements Serializable{
	private String name;
	private String email;
	private String mobileNo;
	private String comment;
	public ContactDTO() {
		
	}
	public ContactDTO(String name, String email, String mobileNo, String comment) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.comment = comment;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public String getComment() {
		return comment;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "ContactDTO [name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", comment=" + comment
				+ "]";
	}
	

}
