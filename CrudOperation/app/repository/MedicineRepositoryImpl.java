package com.xworkz.CrudOperation.app.repository;

public class MedicineRepositoryImpl implements MedicineRepository{
	private double[] prices=new double[TOTAL_MEDICINES];
	int position;

	@Override
	public void cure(double cost) {
		System.out.println("invoking cure in MedicineRepositoryImpl ");
		if (position < TOTAL_MEDICINES) {
			this.prices[position] = cost;
			System.out.println("Stored " + cost + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
	}

}
