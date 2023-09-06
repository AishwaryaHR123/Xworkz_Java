package com.xworkz.CurdOperationService.app.Repository;

public interface PinCodeRepository {
	int TOTAL_CODES= 5;

	void codeAndSave(int number);
	default boolean isExist(int number)
	{
		return false;
	}

}
