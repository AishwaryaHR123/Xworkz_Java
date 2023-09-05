package com.xworkz.CrudOperation.app.repository;

public class MedicineRepositoryImpl implements MedicineRepository{
	private String[] prices=new String[TOTAL_MEDICINES];
	int position;

	@Override
	public void cure(String MedicineName) {
		System.out.println("invoking cure in MedicineRepositoryImpl ");
		if (position < TOTAL_MEDICINES) {
			this.prices[position] = MedicineName;
			System.out.println("Stored " + MedicineName + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
	}

}
