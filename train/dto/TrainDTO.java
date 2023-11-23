package com.xworkz.train.dto;

import com.xworkz.train.constants.TrainClass;

public class TrainDTO {
	private TrainClass train;
	private Double price;
	public TrainDTO(TrainClass train, Double price) {
		super();
		this.train = train;
		this.price = price;
	}
	public TrainClass getTrain() {
		return train;
	}
	public Double getPrice() {
		return price;
	}
	public void setTrain(TrainClass train) {
		this.train = train;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TrainDTO [train=" + train + ", price=" + price + "]";
	}
	

}
