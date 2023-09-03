package com.xworkz.CrudOperation.app.repository;

public class PilotRepositoryImpl implements PilotRepository{
	private String[] pilots=new String[TOTAL_PILOTS];
	int position;

	@Override
	public void navigate(String qualification) {
		System.out.println("invoking navigate in PilotRepositoryImpl");
		if (position < TOTAL_PILOTS) {
			this.pilots[position] = qualification;
			System.out.println("Stored " + qualification + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
	}

}
