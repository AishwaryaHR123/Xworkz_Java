class GoldSmith{
	static void goldInfo(int experience, String address,long contact)
	{
		if(experience>=3)
		{
			System.out.println("condition is valid: "+experience);
		}
		else
		{
			System.err.println("condition is invalid: "+experience);
			return;
		}
		if(address!=null )
		{
			System.out.println("condition is valid: "+address);
		}
		else
		{
			System.err.println("condition is invalid: "+address);
			return;
		}
		if(contact==9905167450l)
		{
			System.out.println("condition is valid: "+contact);
		}
		else
		{
			System.err.println("condition is invalid: "+contact);
			return;
		}
	}
}