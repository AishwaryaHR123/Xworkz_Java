class Electrician{
	static void repair()
	{
		System.out.println("Running repair in Electrician");
		String homeAutomation="wiring";
		String wiring="loop";
		System.out.println("Home Automation Services :"+homeAutomation);
		System.out.println("Wiring :"+wiring);
	}
	static void repair(String homeAutomation)
	{
		System.out.println("Running repair in Electrician");
		System.out.println("Home Automation Services :"+homeAutomation);
	}
	static void repair(String homeAutomation,String wiring)
	{
		System.out.println("Running repair in Electrician");
		
		System.out.println("Home Automation Services :"+homeAutomation);
		System.out.println("Wiring :"+wiring);
	}
	static void installation(int cost)
	{
		System.out.println("Running installation in electrician");
		System.out.println("Cost for installation :"+cost);
	}
	static void installation(float cost,String wiring)
	{
		System.out.println("Running installation in electrician");
		System.out.println("Cost for installation :"+cost);
		System.out.println("Wiring :"+wiring);
	}
	static void wiring(int cost,String name)
	{
		System.out.println("Cost for wiring :"+cost);
		System.out.println("Name of the wire :"+name);
	}
	static void grounding(float price)
	{
		System.out.println("Price for grounding :"+price);
	}
    static void testing(String tester)
	{
		
		System.out.println("Electrical testing :"+tester);
	
	}
    static void cabling(String cableWire)
	{
		
		System.out.println("Cabling :"+cableWire);
	}
    static void	contact(long phNo)
	{
		System.out.println("Contact number of electrician :"+phNo);
	}
	static void experience(int years)
	{
		address();
		electricalServices();
		System.out.println("Experience of electrician :"+years);
	}
	static void electricalServices()
	{
		System.out.println("Electrical services provided by Electrician");
	}
	static void address()
	{
		System.out.println("Address of the electrician");
	}
}