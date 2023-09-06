package com.xworkz.CurdOperationService.app.Repository;

public class PinCodeRepositoryImpl implements PinCodeRepository {
	private int[] codes = new int[TOTAL_CODES];
	private int position = 0;

	@Override
	public void codeAndSave(int number) {
		System.out.println("invoking CodeAndSave in "+this.getClass().getSimpleName());
		if (position < TOTAL_CODES) {
			this.codes[position] = number;
			System.out.println("Stored " + number + " position in " + this.position);
			this.position++;
		} 
		else {
			System.err.println("Position is full unable to save");
		}

	}
	@Override
	public boolean isExist(int number) {
		for (int index = 0; index < this.position; index++) {
			long temp = this.codes[index];

			if (temp!=0 && temp==number) {
				System.out.println("PinCode already Exist");
				return true;
			}
		}
		return PinCodeRepository.super.isExist(number);
	}
		
	

}
