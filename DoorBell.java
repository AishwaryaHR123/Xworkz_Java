class DoorBell{
	double cost;
	String brand;
	String ringing;
	String nightVision;
	String integration;
	String motionDetection;
	String sound;
	
	DoorBell()
	{
		System.out.println("Invoking no-org of doorbell");
		
	}
	
	DoorBell(double cost)
	{
		System.out.println("Invoking constructor of doorbell");
		System.out.println("Cost :"+cost);
		this.cost=cost;
		
	}
	DoorBell(double cost, String brand)
	{
		System.out.println("Invoking constructor of doorbell");
		System.out.println("Cost :"+cost);
		System.out.println("Brand :"+brand);
		
		
		this.cost=cost;
		this.brand=brand;
		
	}
	DoorBell(double cost, String brand,String ringing)
	{
		System.out.println("Invoking constructor of doorbell");
		System.out.println("Cost :"+cost);
		System.out.println("Brand :"+brand);
		System.out.println("Ringing :"+ringing);
		
		
		this.cost=cost;
		this.brand=brand;
		this.ringing=ringing;
		
	}
	DoorBell(double cost, String brand,String ringing,String nightVision)
	{
		System.out.println("Invoking constructor of doorbell");
		System.out.println("Cost :"+cost);
		System.out.println("Brand :"+brand);
		System.out.println("Ringing :"+ringing);
		System.out.println("NightVision :"+nightVision);
		
		
		this.cost=cost;
		this.brand=brand;
		this.ringing=ringing;
		this.nightVision=nightVision;
		
	}
	DoorBell(double cost, String brand,String ringing,String nightVision,String integration)
	{
		System.out.println("Invoking constructor of doorbell");
		System.out.println("Cost :"+cost);
		System.out.println("Brand :"+brand);
		System.out.println("Ringing :"+ringing);
		System.out.println("NightVision :"+nightVision);
		System.out.println("Integration :"+integration);
		
		
		this.cost=cost;
		this.brand=brand;
		this.ringing=ringing;
		this.nightVision=nightVision;
		this.integration=integration;
		
	}
	DoorBell(double cost, String brand,String ringing,String nightVision,String integration,String motionDetection)
	{
		System.out.println("Invoking constructor of doorbell");
		System.out.println("Cost :"+cost);
		System.out.println("Brand :"+brand);
		System.out.println("Ringing :"+ringing);
		System.out.println("NightVision :"+nightVision);
		System.out.println("Integration :"+integration);
		System.out.println("MotionDetection :"+motionDetection);
		
		
		this.cost=cost;
		this.brand=brand;
		this.ringing=ringing;
		this.nightVision=nightVision;
		this.integration=integration;
		this.motionDetection=motionDetection;
		
	}
	DoorBell(double cost, String brand,String ringing,String nightVision,String integration,String motionDetection,String sound)
	{
		System.out.println("Invoking constructor of doorbell");
		System.out.println("Cost :"+cost);
		System.out.println("Brand :"+brand);
		System.out.println("Ringing :"+ringing);
		System.out.println("NightVision :"+nightVision);
		System.out.println("Integration :"+integration);
		System.out.println("MotionDetection :"+motionDetection);
		System.out.println("Sound :"+sound);
		
		this.cost=cost;
		this.brand=brand;
		this.ringing=ringing;
		this.nightVision=nightVision;
		this.integration=integration;
		this.motionDetection=motionDetection;
		this.sound=sound;
	}
}