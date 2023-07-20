class ParkKiller{
	String name;
	int visitorsCount;
	String location;
	int entryFee;
	String facility;
	int hours;
	int rating;
	String event;
	boolean parkingSpace;
	
	ParkKiller()
	{
		System.out.println("invoking no-arguments const of wood");
	}
	ParkKiller(String name)
	{
		System.out.println("invoking String const of park");
		this.name=name;
	}
	ParkKiller(String name,int visitorsCount)
	{
		System.out.println("invoking String,int const of park");
		this.name=name;
		this.visitorsCount=visitorsCount;
	}
	ParkKiller(String name,int visitorsCount,String location)
	{
		this(name,visitorsCount);
		System.out.println("invoking String,int ,String const of park");
		this.location=location;	
	}
	ParkKiller(String name,int visitorsCount,String location,int entryFee)
	{
		this(name,visitorsCount,location);
		System.out.println("invoking String,int ,String,int const of park");
		this.entryFee=entryFee;	
	}
	ParkKiller(String name,int visitorsCount,String location,int entryFee,String facility)
	{
		this(name,visitorsCount,location,entryFee);
		System.out.println("invoking String,int ,String,int,String const of park");
		this.facility=facility;	
	}
	ParkKiller(String name,int visitorsCount,String location,int entryFee,String facility,int hours)
	{
		this(name,visitorsCount,location,entryFee,facility);
		System.out.println("invoking String,int ,String,int,String,int const of park");
		this.hours=hours;	
	}
	ParkKiller(String name,int visitorsCount,String location,int entryFee,String facility,int hours,int rating)
	{
		this(name,visitorsCount,location,entryFee,facility,hours);
		System.out.println("invoking String,int ,String,int,String,int,int const of park");
		this.rating=rating;	
	}
	ParkKiller(String name,int visitorsCount,String location,int entryFee,String facility,int hours,int rating,String event)
	{
		this(name,visitorsCount,location,entryFee,facility,hours,rating);
		System.out.println("invoking String,int ,String,int,String,int,int,String const of park");
		this.event=event;	
	}
	ParkKiller(String name,int visitorsCount,String location,int entryFee,String facility,int hours,int rating,String event,boolean parkingSpace)
	{
		this(name,visitorsCount,location,entryFee,facility,hours,rating);
		System.out.println("invoking String,int ,String,int,String,int,int,String,boolean const of park");
		this.parkingSpace=parkingSpace;	
	}
}