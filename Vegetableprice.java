class Vegetableprice{
	public static void main(String[] args)
	{
		System.out.println("Vegetable Price");
		float tomato=100.00f;
		float beans=30.50f;
		float onion=50.00f;
		float chilli=70.25f;
		float potato=25.50f;
		float brinjal=55.00f;
		float raddish=27.70f;
		float[] vegetables={tomato,beans,onion,chilli,potato,brinjal,raddish};
		int total= vegetables.length;
		
		for (int vegetable=0;vegetable<vegetables.length;vegetable++)
		{
			float ref= vegetables[vegetable];
			System.out.println("vegetable price of "+ref+ " index is "+vegetable);
		}
		
		System.out.println("..............................................................");
		
		System.out.println("Vegetables before changing the position "+vegetables[5]);
		vegetables[5]=57.70f;
		System.out.println("Vegetables after changing the position "+vegetables[5]);
		
		System.out.println("................................................................");
		for (int vegetable=vegetables.length-1;vegetable>=0;vegetable--)
		{
			float ref= vegetables[vegetable];
			System.out.println("vegetable price of "+ref+ " index is "+vegetable);
		}
		
		
			
			
	}
}

		