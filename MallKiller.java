class MallKiller{
	String name;
	String location;
	String store;
	int noOfPeople;
	int noOfEmployee;
	boolean parkingSpace;
	int mallHours;
	MallKiller()
	{
		System.out.println("invoking no-arguments const of wood");
	}
	MallKiller(String name)
	{
		System.out.println("invoking String const in Mall");
		this.name=name;
	}
	MallKiller(String name,String location)
	{
		System.out.println("invoking String,String const in Mall");
		this.name=name;
		this.location=location;
	}
	
	MallKiller(String name,String location,String store)
	{
		this(name,location);
		System.out.println("invoking String,String,String const in Mall");
		this.store=store;
	}
	MallKiller(String name,String location,String store,int noOfPeople)
	{
		this(name,location);
		System.out.println("invoking String,String,int const String in Mall");
		this.noOfPeople=noOfPeople;
	}
	MallKiller(String name,String location,String store,int noOfPeople,int noOfEmployee)
	{
		this(name,location,store,noOfPeople);
		System.out.println("invoking String,String,int,int const String in Mall");
		this.noOfEmployee=noOfEmployee;
	}
	MallKiller(String name,String location,String store,int noOfPeople,int noOfEmployee,boolean parkingSpace)
	{
		this(name,location,store,noOfPeople,noOfEmployee);
		System.out.println("invoking String,String,int,int ,boolean const String in Mall");
		this.parkingSpace=parkingSpace;
	}
	MallKiller(String name,String location,String store,int noOfPeople,int noOfEmployee,boolean parkingSpace,int mallHours)
	{
		this(name,location,store,noOfPeople,noOfEmployee,parkingSpace);
		System.out.println("invoking String,String in Mall");
		this.mallHours=mallHours;
	}
	}
	
		
	
	