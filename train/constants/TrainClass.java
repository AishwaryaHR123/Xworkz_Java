package com.xworkz.train.constants;

public enum TrainClass {
	FIRST_CLASS(1500D),SECOND_CLASS(700D),SUPER_CLASS(300D);
	private Double price;
	

	private TrainClass(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	


	

}
