class Stove{
	static void stoveInfo(String company,int price,String type)
	{
		if(company!=null)
		{
			System.out.println("condition is valid: "+company);
		}
		else
		{
			System.err.println("condition is invalid: "+company);
			return;
		}
		if(price>=5000)
		{
			System.out.println("condition is valid: "+price);
		}
		else
		{
			System.err.println("condition is invalid: "+price);
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
			System.err.println("Stove Information");
	}
}

