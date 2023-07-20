class Contractor{
	static void construction()
	{
		System.out.println("Running construction in Contractor");
		String type="Building";
		int experience=5;
		System.out.println("Contractor constructs :"+type);
		System.out.println("Contractor experience :"+experience);
	}
	static void construction(String type)
	{
		System.out.println("Contractor constructs :"+type);
	}
	static void construction(String type,int experience)
	{
		System.out.println("Contractor constructs :"+type);
		System.out.println("Contractor experience :"+experience);
	}
	static void renovation(String type)
	{
		System.out.println("Running renovation in Contractor");
		System.out.println("Contractor constructs :"+type);
	}
	static void renovation(String type,int cost)
	{
		System.out.println("Running renovation in Contractor");
		System.out.println("Contractor constructs :"+type);
		System.out.println("Cost for construction :"+cost);
	}
	static void plumbing(int cost,String requirement)
	{
		System.out.println("Cost for plumbing :"+cost);
		System.out.println("Requirement for plumbing :"+requirement);
	}
	static void electrical(String item)
	{
		System.out.println("Item required is :"+item);
	}
	static void roofing()
	{
		carpentry();
		address();
		System.out.println("Roofing required for construction");
	}
	static void flooring(float cost)
	{
		System.out.println("Cost for flooring");
	}
	static void address()
	{
		System.out.println("Address of the contractor");
	}
	static void experience(int years)
	{
		System.out.println("Experience of contractor");
	}
	static void demolition(String type)
	{
		System.out.println("Demolition of :"+type);
	}
	static void carpentry()
	{
		System.out.println("Carpentry work is necessory for buildings");
	}
}