class Soil{
	static String color;
	static int pH;
	String type;
	String nutrientLevel;
	Soil(String type,String nutrientLevel)
	{
		System.out.println("invoking String,String in Soil");
		this.type=type;
		this.nutrientLevel=nutrientLevel;
	}
	static
	{
		color="Brown";
		pH=7;
	}
	static void printStatic()
	{
		System.out.println("invoking printStatic in Soil");
		System.out.println("The color is:"+color);
		System.out.println("The pH is:"+pH);
	}
	void printInstance()
	{
		System.out.println("invoking printInstance in Soil");
		System.out.println("The type is:"+this.type);
		System.out.println("The nutrientLevel:"+this.nutrientLevel);
	}
}