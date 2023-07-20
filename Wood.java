class Wood{
	String material;
	double price;
	String name;
	float height;
	float width;
	Wood()
	{
		System.out.println("invoking no-arguments const of wood");
	}
	Wood(String material)
	{
		System.out.println("invoking String const of wood");
		this.material=material;
	}
	Wood(String material,double price)
	{
		System.out.println("invoking String,double const of wood");
		this.material=material;
		this.price=price;
	}
	Wood(String material,double price,String name)
	{
		this(material,price);
		System.out.println("invoking String ,double,string const of wood");
		this.name=name;
	}
	Wood(String material,double price,String name,float height)
	{
		this(material,price,name);
		System.out.println("invoking String,double,string,float const of wood");
		this.height=height;
	}
	Wood(String material,double price,String name,float height,float width)
	{
		this(material,price,name,height);
		System.out.println("invoking String,double,string,float,float const of wood");
		this.width=width;
	}
}
	
		
	