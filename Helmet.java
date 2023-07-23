class Helmet{
	static String brand;
	static String type;
	String color;
	double price;
	Helmet(String color,double price)
	{
		System.out.println("invoking String,double in Helmet");
		this.color=color;
		this.price=price;
	}
	static{
		brand="Vega";
		type="half";
	}
	static void printStatic()
	{
		System.out.println("Invoking PrintStatic in Helmet");
		System.out.println("The brand name is: "+brand);
		System.out.println("The type information: "+type);
	}
	void printInstance()
	{
		System.out.println("Invoking PrintInstance in Helmet");
		System.out.println("The colorInfo is: "+this.color);
		System.out.println("The Price information: "+this.price);
	}
}
		
	
		
		
		