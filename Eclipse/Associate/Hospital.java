package com.xworkz.Associate;

public class Hospital {
	public Doctor doctor;
	public Nurse nurse;
	public Patient patient;
	public void hName()
	{
		System.out.println("invoking Hospitalname in Hospital");
		{
		if(this.doctor!=null) {
			this.doctor.name();
		}
		else {
			System.err.println("doctor is null cannot invoke the hName ");
		}
		}
		
		{
			if(this.nurse!=null) {
				this.nurse.salary();
			}
			else {
				System.err.println("nurse is null cannot invoke the hName ");
			}
			}
		
		{
			if(this.patient!=null) {
				this.patient.location();
			}
			else {
				System.err.println("patient is null cannot invoke the hName ");
			}
			}
	}
	public void hAddress()
	{
		System.out.println("invoking HospitalAddress in Hospital");
		{
		if(this.doctor!=null) {
			this.doctor.qualification();
		}
		else {
			System.err.println("doctor is null cannot invoke the hAddress ");
		}
	}
		{
			if(this.nurse!=null) {
				this.nurse.specialization();
			}
			else {
				System.err.println("nurse is null cannot invoke the hAddress ");
			}
		}
		{
			if(this.patient!=null) {
				this.patient.age();
			}
			else {
				System.err.println("patient is null cannot invoke the hAddress ");
			}
		}
		
	}
	 
	

}
