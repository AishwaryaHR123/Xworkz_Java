class Oven{
	static void ovenInfo(String brand,int cost,String color)
	{
		if(brand!=null)
		{
			System.out.println("condition is valid: "+brand);
		}
		else
		{
			System.err.println("condition is invalid: "+brand);
			return;
		}
		if(cost>=5000 && cost<=50000)
		{
			System.out.println("condition is valid: "+cost);
		}
		else
		{
			System.err.println("condition is invalid: "+cost);
			return;
		}
		if(color!=null)
		{
			System.out.println("condition is valid: "+color);
		}
		else
		{
			System.err.println("condition is invalid: "+color);
			return;
		}
	}
}