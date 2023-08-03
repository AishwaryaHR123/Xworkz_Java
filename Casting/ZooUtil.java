package com.xworkz.Casting;

public class ZooUtil {
	public static void ticket(Zoo zoo)
	{
		System.out.println("invoking ticket in ZooUtil");
		System.out.println(zoo.name);
		zoo.zooInfo();
		if(zoo instanceof StateZoo)
		{
			System.out.println("zoo is StateZoo");
			StateZoo stateZoo =(StateZoo)zoo;
			System.out.println(stateZoo.noOfAnimal);
			stateZoo.animal();
		}
		if(zoo instanceof NationalZoo)
		{
			System.out.println("zoo is NationalZoo");
			NationalZoo nationalZoo =(NationalZoo)zoo;
			System.out.println(nationalZoo.location);
			nationalZoo.bird();
		}
	}

}
