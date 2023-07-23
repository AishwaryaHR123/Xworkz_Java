class Butterfly{
	static String name;
	static String color;
	String size;
	String lifeSpan;
	Butterfly(String size,String lifeSpan)
	{
		System.out.println("invoking String,String in Butterfly");
		this.size=size;
		this.lifeSpan=lifeSpan;
	}
	static
	{
		name="Blue Morpho";
		color="Blue";
	}
	static void printStatic()
	{
		System.out.println("invoking printStatic in Butterfly");
		System.out.println("The ButterFly name is:"+name);
		System.out.println("The ButterFly Color is:"+color);
	}
	void printInstance()
	{
		System.out.println("invoking printInstance in Butterfly");
		System.out.println("The size is:"+this.size);
		System.out.println("The lifeSpan is:"+this.lifeSpan);
	}
}