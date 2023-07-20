class Drone
{
	static double getDistanceByFlight(String operator,String event)
	{
		System.out.println("invoking getDistanceByFlight in drone");
		if(operator!=null && event!=null)
		{
				System.out.println("operator and event informaton:");
				
				if(operator=="EASA" && event =="meetings")
				{
					System.out.println("operator used "+operator+ " event is "+event);
					return 40;
				}
				else
				{
					System.out.println("operator and event is in-valid");
					return 30;
				}
		}
		System.out.println("after if else statements");
		return 77;
	}
	static double getPricePerEvent(String eventName)
	{
		System.out.println("..........................................................");
		System.out.println("invoking getPricePerEvent in drone");
		if(eventName!=null)
		{
			System.out.println("event informaton:");
			if(eventName =="NamingCeremony")
			{
				System.out.println("event name is "+eventName);
				return 55;
			}
			else{
				System.out.println("event is in-valid");
				return 30;
			}
		}
		System.out.println("after if else statements");
		return 80;
	}	
	static int getDiscountByEvent(String eventName,String reference)
	{
		System.out.println("..........................................................");
		System.out.println("invoking getDiscountByEvent in drone");
		if(eventName!=null && reference!=null){
			System.out.println("eventName informaton:");
			if(eventName=="Dasara" && reference=="Aishuu")
				{
					System.out.println("eventName used "+eventName+ " reference is "+reference);
					return 45;
				}
				else
				{
					System.out.println("eventName and reference is in-valid");
					return 65;
				}
		}
		System.out.println("after if else statements");
		return 85;
	}
		
	public static void main(String[] args)
	{
		System.out.println("invoking DroneMain in the main");
		double ref=Drone.getDistanceByFlight("EASA","meetings");
		System.out.println("ref is: "+ref);
		double ref1=Drone.getPricePerEvent("NamingCeremony");
		System.out.println("reference is :" +ref1);
		int ref2=Drone.getDiscountByEvent("Dasara","Aishuu");
		System.out.println("reference is :" +ref2);
}
}
		
		
			