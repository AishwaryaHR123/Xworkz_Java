package com.xworkz.Associate;

public class Garage {
	public Mechanic mechanic;
	public void location() {
		System.out.println("invoking location in garage");
		if(this.mechanic!=null) {
			this.mechanic.Wash();
		}
		else {
			System.err.println("mechanic is null cannot invoke location");
		}
	}
		public void service() {
			System.out.println("invoking Service in garage");
			if(this.mechanic!=null) {
				this.mechanic.Repair();
			}
			else {
				System.err.println("mechanic is null cannot invoke Service");
			}
		
		
	}

}
