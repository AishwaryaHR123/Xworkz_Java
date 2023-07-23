class Bureau{
	static String brand;
	static String type;
	String color;
	double price;
	Bureau(String color,double price)
	{
		System.out.println("invoking String,double in Bureau");
		this.color=color;
		this.price=price;
	}
	static{
		brand="Ercol";
		type="BookCase";
	}
	static void printStatic()
	{
		System.out.println("Invoking PrintStatic in Bureau");
		System.out.println("The brand name is: "+brand);
		System.out.println("The type information: "+type);
	}
	void printInstance()
	{
		System.out.println("Invoking PrintInstance in Bureau");
		System.out.println("The colorInfo is: "+this.color);
		System.out.println("The Price information: "+this.price);
	}
}
	