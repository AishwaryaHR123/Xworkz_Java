class Candle{
	static String shape;
	static String material;
	double price;
	String color;
	Candle(double price,String color)
	{
		System.out.println("invoking String,double in Candle");
		this.price=price;
		this.color=color;
	}
	static
	{
		shape="Cylindrical";
		material="Wax";
	}
	static void printStatic()
	{
		System.out.println("invoking printStatic in Candle");
		System.out.println("The shape is: "+shape);
		System.out.println("The Material is: "+material);
	}
	void printInstance()
	{
		System.out.println("invoking printInstance in Candle");
		System.out.println("The price is: "+this.price);
		System.out.println("The Color is: "+this.color);
	}
}
	