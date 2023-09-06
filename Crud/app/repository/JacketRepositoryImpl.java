package com.xworkz.CrudOperation.app.repository;

public class JacketRepositoryImpl implements JacketRepository {
	private String[] brands=new String[TOTAL_BRANDS];
	int position;

	@Override
	public void wear(String brand) {
		System.out.println("invoking Wear in JacketRepositoryImpl");
		if (position < TOTAL_BRANDS) {
			this.brands[position] = brand;
			System.out.println("Stored " + brand + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
		
	}

}
