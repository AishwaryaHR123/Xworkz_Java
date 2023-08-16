package com.xworkz.object;

public class Karchief {
	private double cost;
	private String color;
	private String material;
	private boolean designGood;
	private String shape;
	private int lenght;
	private boolean clothGood;

	public Karchief() {
	}

	public Karchief(double cost, String color, String material, boolean designGood, String shape, int lenght,
			boolean clothGood) {
		super();
		this.cost = cost;
		this.color = color;
		this.material = material;
		this.designGood = designGood;
		this.shape = shape;
		this.lenght = lenght;
		this.clothGood = clothGood;
	}

	@Override
	public String toString() {
		return "cost=" + cost + ", color=" + color + ", material=" + material + ", designGood=" + designGood
				+ ", shape=" + shape + ", lenght=" + lenght + ", clothGood=" + clothGood + "";
	}

}
