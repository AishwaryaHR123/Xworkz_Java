package com.xworkz.Method;

import java.time.LocalDateTime;

public class LocalDateTimeRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in LocalDateTimeRunner");
		LocalDateTime localDateTime;
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.MAX);
		System.out.println(LocalDateTime.MIN);
		System.out.println(LocalDateTime.of(2023, 8, 23, 21, 20));
		System.out.println(LocalDateTime.of(2022, 7, 22, 12, 13, 35));
	}

}
