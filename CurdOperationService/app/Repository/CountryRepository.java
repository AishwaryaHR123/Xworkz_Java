package com.xworkz.CurdOperationService.app.Repository;

public interface CountryRepository {
	int TOTAL_COUNTRY = 5;

	void countryStore(String name);

	default boolean isExist(String name) {
		return false;
	}

}
