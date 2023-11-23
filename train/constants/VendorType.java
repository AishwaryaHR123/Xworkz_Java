package com.xworkz.train.constants;

public enum VendorType {
	AMAZON("342ZO",3453,"Aishwarya"),FLIPKART("561FL",6780,"Anusha"),AJIO("907AJ",5460,"Pooja"),MYNTRA("567MN",1342,"Sushma");
	private String gstNo;
	private Integer serialNo;
	private String name;
	private VendorType(String gstNo, Integer serialNo, String name) {
		this.gstNo = gstNo;
		this.serialNo = serialNo;
		this.name = name;
	}
	public String getGstNo() {
		return gstNo;
	}
	public Integer getSerialNo() {
		return serialNo;
	}
	public String getName() {
		return name;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
