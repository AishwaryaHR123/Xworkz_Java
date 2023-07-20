class Scanner{
	static void scannerInfo(String brand,int cost,String type)
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
		if(cost>=5000)
		{
			System.out.println("condition is valid: "+cost);
		}
		else
		{
			System.err.println("condition is invalid: "+cost);
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
	}
}