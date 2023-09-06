package com.xworkz.CurdOperationService.boot;

import com.xworkz.CurdOperationService.app.Repository.PinCodeRepository;
import com.xworkz.CurdOperationService.app.Repository.PinCodeRepositoryImpl;
import com.xworkz.CurdOperationService.app.Service.PinCodeService;
import com.xworkz.CurdOperationService.app.Service.PinCodeServiceImpl;

public class PinCodeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PinCodeRunner");
		PinCodeRepository pinCodeRepository=new PinCodeRepositoryImpl();
		PinCodeService pinCodeService=new PinCodeServiceImpl(pinCodeRepository);
		boolean saved = pinCodeService.validateAndSave(577221);
		System.out.println("Saved = "+saved);
		pinCodeService.validateAndSave(577221);
		pinCodeService.validateAndSave(560010);
	}

}
