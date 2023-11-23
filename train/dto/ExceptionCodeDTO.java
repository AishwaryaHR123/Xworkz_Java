package com.xworkz.train.dto;

import com.xworkz.train.constants.ExceptionCode;

public class ExceptionCodeDTO {
	private ExceptionCode exceptionCode;
	private String code;
	private String msg;
	public ExceptionCodeDTO(ExceptionCode exceptionCode, String code, String msg) {
		super();
		this.exceptionCode = exceptionCode;
		this.code = code;
		this.msg = msg;
	}
	public ExceptionCode getExceptionCode() {
		return exceptionCode;
	}
	
	public void setExceptionCode(ExceptionCode exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ExceptionCodeDTO [exceptionCode=" + exceptionCode + ", code=" + code + ", msg=" + msg + "]";
	}
	
	

}
