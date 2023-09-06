package com.xworkz.CrudOperation.app.repository;

public class JuiceRepositoryImpl implements JuiceRepository {
	private String[] juices = new String[TOTAL_ITEMS];
	private int position = 0;

	@Override
	public void store(String name) {
		System.out.println("invoking store in " + this.getClass().getSimpleName());

		if (position < TOTAL_ITEMS) {
			this.juices[position] = name;
			System.out.println("stored " + name + " position in " + this.position);
			this.position++;
		}
		else {
			System.err.println("Position is full unable to Save");
		}
	}

	@Override
	public boolean isExist(String name) {
		for (int index = 0; index < this.position; index++) {
			String temp = this.juices[index];
			
			if (temp != null && temp.equals(name)) {
				System.out.println("Juice already exists");
				return true;
			}

		}
		return JuiceRepository.super.isExist(name);
	}

}
