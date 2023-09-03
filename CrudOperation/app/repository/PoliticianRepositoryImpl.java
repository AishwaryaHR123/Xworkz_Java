package com.xworkz.CrudOperation.app.repository;

public class PoliticianRepositoryImpl implements PoliticianRepository {
	private int[] politicians=new int[TOTAL_POLITICIANS];
	int position;

	@Override
	public void rule(int experience) {
		System.out.println("invoking rule in PoliticianRepositoryImpl ");
		if (position < TOTAL_POLITICIANS) {
			this.politicians[position] = experience;
			System.out.println("Stored " + experience + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
	}

}
