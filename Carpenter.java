class Carpenter{
	static void cut()
	{
		System.out.println("Invoking cut in Carpenter");
		int cost=500;
		int experience=5;
		System.out.println("Cost :"+cost);
		System.out.println("Experience :"+experience);
	}
	static void cut(int cost)
	{
		System.out.println("Invoking cut in Carpenter");
		System.out.println("Cost :"+cost);
	}
	static void cut(float cost,int experience)
	{
		
		System.out.println("Invoking cut in Carpenter");
		System.out.println("Cost :"+cost);
		System.out.println("Experience :"+experience);
	}
	static void polishing(String wood)
	{
		System.out.println("Invoking polishing in Carpenter");
		System.out.println("Polish the Wood material :"+wood);
	}
	static void polishing(String wood,int price)
	{
		System.out.println("Invoking polishing in Carpenter");
		System.out.println("Polish the Wood material :"+wood);
		System.out.println("Price :"+price);

	}
	static void repair(int cost)
	{		
		System.out.println("Cost :"+cost);
	}
	static void framing(String wood)
	{
		System.out.println("Wood :"+wood);
		
	}
	static void shape(String design)
	{
		window();
		System.out.println("Gives shape for wood :"+design);
	}
	static void phoneNo(long number)
	{
		System.out.println("Carpenter Phone Number :"+number);
	}
    static void window()
	{
		address();
		buildingWoodenRoof();
		skill();
		System.out.println("Designing window");
	}
	static void buildingWoodenRoof()
	{
		System.out.println("Corpenter works in construction of building roof");
	}
	static void skill()
	{
		System.out.println("Running skill in carpenter");
	}
	static void address()
	{
		System.out.println("Address of the carpenter is banglore");
	}
}