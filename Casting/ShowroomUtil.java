package com.xworkz.Casting;

public class ShowroomUtil {
	public static void run(Showroom showroom)
	{
		System.out.println("invoking run in ShowroomUtil");
		System.out.println(showroom.location);
		showroom.showroomInfo();
		if(showroom instanceof WatchShowroom)
		{
			System.out.println("showroom is WatchShowroom");
			WatchShowroom watchShowroom=(WatchShowroom)showroom;
			System.out.println(watchShowroom.showroomName);
			watchShowroom.sell();
		}
		if(showroom instanceof MobileShowroom)
		{
			System.out.println("showroom is MobileShowroom");
			MobileShowroom MobileShowroom=(MobileShowroom)showroom;
			System.out.println(MobileShowroom.service);
			MobileShowroom.mobileInfo();;
		}
		
	}

}
