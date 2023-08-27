package com.xworkz.app.Methods;

public class StringBuffer {

	public static void main(String[] args) {
		System.out.println("Invoking main in StringBuffer");
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println(stringBuffer.equals(stringBuffer));
		System.out.println(stringBuffer.hashCode());
		System.out.println(stringBuffer.toString());
		System.out.println(stringBuffer.getClass());
		//System.out.println(stringBuffer.notify());

	}

}
