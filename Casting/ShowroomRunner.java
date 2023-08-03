package com.xworkz.Casting;

public class ShowroomRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in ShowroomRunner");
		System.out.println("...............................");
		Showroom showroom =new Showroom();
		WatchShowroom watchShowroom=new WatchShowroom();
		MobileShowroom mobileShowroom=new MobileShowroom();
		ShowroomUtil.run(showroom);
		System.out.println("...............................");
		ShowroomUtil.run(watchShowroom);
		System.out.println("...............................");
		ShowroomUtil.run(mobileShowroom);
		
	}

}
