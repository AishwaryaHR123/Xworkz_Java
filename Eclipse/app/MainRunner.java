package com.xworkz.app;

public class MainRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in the MainRunner");
		Minister minister=new Minister();
		String ref=minister.name;
		Experience ref1=minister.experience;
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println(".......................");
		Constituency constituency=minister.constituency;
		int ref2=constituency.cNo;
		Population ref3=constituency.population;
		System.out.println(ref2);
		System.out.println(ref3);
		System.out.println(".........................");
		IndiraCanteen indiraCanteen=constituency.indiraCanteen;
		int ref4= indiraCanteen.breakFastPrice;
		LunchPrice ref5=indiraCanteen.lunchPrice;
		System.out.println(ref4);
		System.out.println(ref5);
		
	}

}
