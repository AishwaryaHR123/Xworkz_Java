package com.xworkz.CurdOperationService.app.Repository;

public class TrainNoRepositoryImpl implements TrainNoRepository {
	private int[] trainNos = new int[TOTAL_TRAIN_NO];
	private int position = 0;
	
	@Override
	public void TrainNoAndSave(int trainNumber) {
		System.out.println("invoking TrainNoAndSave in "+this.getClass().getSimpleName());
		if (position < TOTAL_TRAIN_NO) {
			this.trainNos[position] = trainNumber;
			System.out.println("Stored " + trainNumber + " position in " + this.position);
			this.position++;
		} 
		else {
			System.err.println("Position is full unable to save");
		}
		
	}
	@Override
	public boolean isExist(int trainNumber) {
		for (int index = 0; index < this.position; index++) {
			long temp = this.trainNos[index];

			if (temp!=0 && temp==trainNumber) {
				System.out.println("trainNumber already Exist");
				return true;
			}
		}
		
		return TrainNoRepository.super.isExist(trainNumber);
	}
		
		
	}


