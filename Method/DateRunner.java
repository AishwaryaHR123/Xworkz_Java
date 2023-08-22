package com.xworkz.Method;

import java.util.Date;

public class DateRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in DateRunner");
		Date date = new Date(2023, 8, 22);
		Date date1 = new Date(2023, 8, 22);
		Date date2 = new Date(2023, 7, 23);
		System.out.println(date1.after(date2));
		System.out.println(date1.before(date2));
		System.out.println(date1.equals(date2));
		System.out.println(date.compareTo(date1));
		System.out.println(date1.getTime());

	}

}
