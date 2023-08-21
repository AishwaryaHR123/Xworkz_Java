package com.xworkz.Main;

import com.xworkz.Class.LocalDate;

public class LocalDateRunner {
	public static void main(String[] args) {
		System.out.println("------------Instance-----------");
		LocalDate localdate=new LocalDate();
		boolean ref = localdate.equals(localdate);
		System.out.println(ref);
		int ref1 = localdate.hashCode();
		System.out.println(ref1);
		String ref2 = localdate.toString();
		System.out.println(ref2);
	}

}
