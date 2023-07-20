class Park{
	String name;
	int visitorsCount;
	String location;
	int entryFee;
	String facility;
	int hours;
	int rating;
	String event;
	boolean parkingSpace;
	
	Park()
	{
		System.out.println("invoking no-arguments const of wood");
	}
	Park(String name)
	{
		System.out.println("invoking String const of park");
		this.name=name;
	}
	Park(String name,int visitorsCount)
	{
		System.out.println("invoking String,int const of park");
		this.name=name;
		this.visitorsCount=visitorsCount;
	}
	Park(String name,int visitorsCount,String location)
	{
		this(name,visitorsCount);
		System.out.println("invoking String,int ,String const of park");
		this.location=location;	
	}
	Park(String name,int visitorsCount,String location,int entryFee)
	{
		this(name,visitorsCount,location);
		System.out.println("invoking String,int ,String,int const of park");
		this.entryFee=entryFee;	
	}
	Park(String name,int visitorsCount,String location,int entryFee,String facility)
	{
		this(name,visitorsCount,location,entryFee);
		System.out.println("invoking String,int ,String,int,String const of park");
		this.facility=facility;	
	}
	Park(String name,int visitorsCount,String location,int entryFee,String facility,int hours)
	{
		this(name,visitorsCount,location,entryFee,facility);
		System.out.println("invoking String,int ,String,int,String,int const of park");
		this.hours=hours;	
	}
	Park(String name,int visitorsCount,String location,int entryFee,String facility,int hours,int rating)
	{
		this(name,visitorsCount,location,entryFee,facility,hours);
		System.out.println("invoking String,int ,String,int,String,int,int const of park");
		this.rating=rating;	
	}
	Park(String name,int visitorsCount,String location,int entryFee,String facility,int hours,int rating,String event)
	{
		this(name,visitorsCount,location,entryFee,facility,hours,rating);
		System.out.println("invoking String,int ,String,int,String,int,int,String const of park");
		this.event=event;	
	}
	Park(String name,int visitorsCount,String location,int entryFee,String facility,int hours,int rating,String event,boolean parkingSpace)
	{
		this(name,visitorsCount,location,entryFee,facility,hours,rating);
		System.out.println("invoking String,int ,String,int,String,int,int,String,boolean const of park");
		this.parkingSpace=parkingSpace;	
	}
}