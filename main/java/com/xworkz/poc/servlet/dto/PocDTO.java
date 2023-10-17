package com.xworkz.poc.servlet.dto;

public class PocDTO {
	private String userId;
	private String password;
	private String no;
	private String street;
	private String city;
	private String state;	
	private String country;	
	public PocDTO() {
		
	}
	public PocDTO(String userId, String password, String no, String street, String city, String state, String country) {
		super();
		this.userId = userId;
		this.password = password;
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public PocDTO(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public PocDTO(String no, String street, String city, String state, String country) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
