package com.xworkz.train.constants;

public enum MovieTicket {
	BALCONY(300D,"545BA",20D),GOLD_CLASS(350D,"430GOl",10D),FIRST_CLASS(400D,"520FI",15D),EXECUTIVE(500D,"760EXE",7D);
	private Double price;
	private String gstNo;
	private Double discount;
	private MovieTicket(Double price, String gstNo, Double discount) {
		this.price = price;
		this.gstNo = gstNo;
		this.discount = discount;
	}
	public Double getPrice() {
		return price;
	}
	public String getGstNo() {
		return gstNo;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	

}
