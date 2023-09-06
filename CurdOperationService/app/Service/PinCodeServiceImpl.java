package com.xworkz.CurdOperationService.app.Service;

import com.xworkz.CurdOperationService.app.Repository.PinCodeRepository;

public class PinCodeServiceImpl implements PinCodeService {
	private PinCodeRepository pinCodeRepository;
	public PinCodeServiceImpl(PinCodeRepository pinCodeRepository) {
		this.pinCodeRepository=pinCodeRepository;
	}

	@Override
	public boolean validateAndSave(int pinCode) {
		System.out.println("invoking ValidateAndSave " + this.getClass().getSimpleName());
		if (pinCode!=0) {
			System.out.println("PinCode is valid,stored in repo");
			if (!this.pinCodeRepository.isExist(pinCode)) {
				this.pinCodeRepository.codeAndSave(pinCode);
				return true;
			} else {
				System.err.println("PinCode " + pinCode + " already exists,add another one");
			}
		} else {
			System.err.println("PinCode " + pinCode + " is invalid");
		}
		return false;
	}

}
