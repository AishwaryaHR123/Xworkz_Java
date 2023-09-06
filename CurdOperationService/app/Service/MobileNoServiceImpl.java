package com.xworkz.CurdOperationService.app.Service;

import com.xworkz.CurdOperationService.app.Repository.MobileNoRepository;

public class MobileNoServiceImpl implements MobileNoService {
	private MobileNoRepository mobileNoRepository;
	public MobileNoServiceImpl(MobileNoRepository mobileNoRepository) {
		this.mobileNoRepository=mobileNoRepository;
	}
	

	@Override
	public boolean validateAndSave(long mobileNo) {
		System.out.println("invoking ValidateAndSave " + this.getClass().getSimpleName());
		if (mobileNo!=0) {
			System.out.println("MobileNo is valid,stored in repo");
			if (!this.mobileNoRepository.isExist(mobileNo)) {
				this.mobileNoRepository.MobileAndSave(mobileNo);
				return true;
			} else {
				System.err.println("Mobile Number " + mobileNo + " already exists,add another one");
			}
		} else {
			System.err.println("Mobile Number " + mobileNo + " is invalid");
		}
		return false;
	}

}
