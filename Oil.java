class Oil{
	String name;
	String brand;
	int quantity;
	Oil()
	{
		System.out.println("invoking no arguments");
		String name="SunFlower";
		System.out.println(name);
		
	}
	Oil(String name)
	{
		System.out.println("invoking string constructor of oil");
		System.out.println("Oil info :"+name);
		this.name=name;
	}
	Oil(String name,String brand)
	{
		System.out.println("invoking string constructor of oil");
		System.out.println("Oil info:"+name);
		System.out.println("Oil info:"+brand);
		this.name=name;
		this.brand=brand;
	}
	Oil(String name,String brand,int quantity)
	{
		System.out.println("invoking string int constructor of oil");
		System.out.println("Oil info:"+name);
		System.out.println("Oil info:"+brand);
		System.out.println("Oil info:"+quantity);
		this.name=name;
		this.brand=brand;
		this.quantity=quantity;
	}
}
		