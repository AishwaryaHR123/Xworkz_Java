class Soda{
	static void sodaInfo(String flavour, int cost1,String type)
	{
		if(flavour!=null)
		{
			System.out.println("condition is valid: "+flavour);
		}
		else
		{
			System.err.println("condition is invalid: "+flavour);
			return;
		}
		if(cost1<=50)
		{
			System.out.println("condition is valid: "+cost1);
		}
		else
		{
			System.err.println("condition is invalid: "+cost1);
			return;
		}
		if(type!=null)
		{
			System.out.println("condition is valid: "+type);
		}
		else
		{
			System.err.println("condition is invalid: "+type);
			return;
		}
		System.err.println("soda Information");
	}
}
		