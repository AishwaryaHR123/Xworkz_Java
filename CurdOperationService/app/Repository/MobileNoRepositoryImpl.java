package com.xworkz.CurdOperationService.app.Repository;

public class MobileNoRepositoryImpl implements MobileNoRepository {
	private long[] numbers = new long[TOTAL_NUMBERS];
	private int position = 0;

	@Override
	public void MobileAndSave(long number) {
		System.out.println("invoking MobileAndSave in "+this.getClass().getSimpleName());
		if (position < TOTAL_NUMBERS) {
			this.numbers[position] = number;
			System.out.println("Stored " + number + " position in " + this.position);
			this.position++;
		} 
		else {
			System.err.println("Position is full unable to save");
		}

	}
	@Override
	public boolean isExist(long number) {
		for (int index = 0; index < this.position; index++) {
			long temp = this.numbers[index];

			if (temp!=0 && temp==number) {
				System.out.println("MobileNo already Exist");
				return true;
			}
		}
		return MobileNoRepository.super.isExist(number);
	}

}
