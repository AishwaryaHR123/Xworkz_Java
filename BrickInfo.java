class BrickInfo{
	static String type;
	static String brand;
	String size;
	String color;
	BrickInfo(String size,String color)
	{
		System.out.println("invoking String,String in Brick");
		this.size=size;
		this.color=color;
	}
	static
	{
		type="clay Bricks";
		brand="Bharat";
	}
	static void printStatic()
	{
		System.out.println("invoking printStatic in Brick");
		System.out.println("The Type is:"+type);
		System.out.println("The brand name is:"+brand);
	}
	void printInstance()
	{
		System.out.println("invoking printInstance in Brick");
		System.out.println("The Size is:"+this.size);
		System.out.println("The brick color is:"+this.color);
	}
}
		
	
	
	