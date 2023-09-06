package com.xworkz.CurdOperationService.app.Repository;

public interface TrainNoRepository {
	int TOTAL_TRAIN_NO= 5;

	void TrainNoAndSave(int trainNumber);
	default boolean isExist(int trainNumber)
	{
		return false;
	}

}
