package com.xworkz.CurdOperationService.app.Repository;

public interface LocationRepository {
	int TOTAL_LOCATION = 5;

	void locationAndSave(String name);
	default boolean isExist(String name)
	{
		return false;
	}

}
