package com.xworkz.CrudOperation.app.repository;

public interface JuiceRepository {
	int TOTAL_ITEMS = 5;

	void store(String name);

	default boolean isExist(String name) {
		return false;
	}

}
