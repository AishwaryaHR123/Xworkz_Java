package com.xworkz.festivalname.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FestivalRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in FestivalRunner");
		Collection<String> festivalCollection=new ArrayList();
		festivalCollection.add("Diwali");
		festivalCollection.add("Holi");
		festivalCollection.add("Navratri");
		festivalCollection.add("Durga Puja");
		festivalCollection.add("ganesh Chaturthi");
		festivalCollection.add("Raksha Bandhan");
		festivalCollection.add("Pongal");
		festivalCollection.add("Onam");
		festivalCollection.add("Makar Sankranti");
		festivalCollection.add("Janmashtami");
		festivalCollection.add("Christmas");
		festivalCollection.add("Ramadan");
		festivalCollection.add("Maha Shivaratri");
		festivalCollection.add("Ramanavami");
		festivalCollection.add("Dussehra");
		
		System.out.println("----------More Than 6 Characters---------");
		festivalCollection.stream().filter((fest)->fest.length()>6).forEach(fest->System.out.println(fest));
		
		System.out.println("-------------Less Than 6 Characters----------------------");
		festivalCollection.stream().filter((fest)->fest.length()<6).forEach(fest->System.out.println(fest));
		
		System.out.println("-------Elements which contain 'O' or 'o'--------");
		List<String> festivalContainsO = festivalCollection.stream().filter((fest)->fest.contains("O") || fest.contains("o")).collect(Collectors.toList());
		festivalContainsO.forEach(fest -> System.out.println(fest));
		
		System.out.println("---------Elements which !contain 'g'---------------");
		List<String> festivalNotContainsG=festivalCollection.stream().filter((fest)->!fest.contains("g")).collect(Collectors.toList());
		festivalNotContainsG.forEach(fest->System.out.println(fest));
		
		System.out.println("--------Elements which Ends with 'S' or 's'-----------------");
		List<String> festivalEndsWithS=festivalCollection.stream().filter((fest)->fest.endsWith("S") || fest.endsWith("s")).collect(Collectors.toList());
		festivalEndsWithS.forEach(fest->System.out.println(fest));
		
		System.out.println("--------Elements which Contain 'Z' or 'R'-----------------");
		List<String> festivalContainsZR = festivalCollection.stream().filter((fest)->fest.contains("Z") || fest.contains("R")).collect(Collectors.toList());
		festivalContainsZR.forEach(fest->System.out.println(fest));
		
		System.out.println("--------Elements which contains 'Ram' ---------------------");
		List<String> festivalContainsRam = festivalCollection.stream().filter((r)->r.contains("Ram")).collect(Collectors.toList());
		festivalContainsRam.forEach(fest->System.out.println(fest));

	}

}
