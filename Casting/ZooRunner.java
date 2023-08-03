package com.xworkz.Casting;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ZooRunner");
		System.out.println("...............................");
		Zoo zoo=new Zoo();
		StateZoo stateZoo=new StateZoo();
		NationalZoo nationalZoo=new NationalZoo();
		ZooUtil.ticket(zoo);
		System.out.println("...............................");
		ZooUtil.ticket(nationalZoo);
		System.out.println("...............................");
		ZooUtil.ticket(stateZoo);
	}

}
