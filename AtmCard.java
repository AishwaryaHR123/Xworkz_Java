class AtmCard{
	String bank;
	String service;
	int pinNumber;
	
	AtmCard()
	{
		System.out.println("Pin Number :"+this.pinNumber);
		System.out.println("Bank name :"+this.bank);
		System.out.println("Service :"+this.service);
	}
	AtmCard(int pinNumber,String bank,String service)
	{
		this.pinNumber=pinNumber;
		this.bank=bank;
		this.service=service;
		System.out.println("Pin Number :"+this.pinNumber);
		System.out.println("Bank name :"+this.bank);
		System.out.println("Service :"+this.service);
	}
}