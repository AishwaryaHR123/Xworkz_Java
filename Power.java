class Power{
	static String frequency;
	static float powerFactor;
	String resistance;
	double voltage;
	Power(String resistance,int voltage)
	{
		System.out.println("invoking String,double in Power");
		this.resistance=resistance;
		this.voltage=voltage;
	}
	static
	{
		frequency="150 Hz";
		powerFactor=0.9f;
	}
	static void printStatic()
	{
		System.out.println("invoking printStatic in Power");
		System.out.println("The Frequency is:"+frequency);
		System.out.println("The PowerFactor is:"+powerFactor);
	}
	void printInstance()
	{
		System.out.println("invoking printInstance in Power");
		System.out.println("The Resistance is:"+this.resistance);
		System.out.println("The Voltage is:"+this.voltage);
	}
}