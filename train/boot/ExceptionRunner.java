package com.xworkz.train.boot;

import com.xworkz.train.constants.ExceptionCode;
import com.xworkz.train.dto.ExceptionCodeDTO;

public class ExceptionRunner {

	public static void main(String[] args) {
		ExceptionCodeDTO codeDTO=new ExceptionCodeDTO(ExceptionCode.COMPILE_TIME, "public(Exception e)", "Hello world");
		System.out.println(codeDTO);
		System.out.println(codeDTO.getExceptionCode().getMsg());
		System.out.println(codeDTO.getExceptionCode().getCode());
		

	}

}
