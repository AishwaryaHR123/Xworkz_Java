package com.xworkz.CurdOperationService.app.Repository;

public interface MobileNoRepository {
	int TOTAL_NUMBERS= 5;

	void MobileAndSave(long number);
	default boolean isExist(long number)
	{
		return false;
	}


}
