package com.xworkz.train.constants;

public enum ExceptionCode {
	RUNTIME("1/0","Arithmetic Exception"),COMPILE_TIME("Tea","Class Not Found Exception");
	private String code;
	private String msg;

	private ExceptionCode(String code,String msg) {
		this.code=code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
