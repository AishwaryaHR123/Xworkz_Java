class Biscuit{
	public static void main(String[] args){
		System.out.println("Biscuite Names: ");
		String parleg="Parle-G";
		String gooday="Good Day";
		String mariegold="Marie Gold";
		String oreo="Oreo";
		String unibic="Unibic";
		String patanjali="Patanjali";
		String cookies="Cookies";
		String[] biscuitNames={parleg,gooday,mariegold,oreo,unibic,patanjali,cookies};
		int total=biscuitNames.length;
		
		for(int biscuit=0;biscuit<biscuitNames.length;biscuit++)
		{
			String ref=biscuitNames[biscuit];
			System.out.println("Biscuit Name "+ref+ " index is " +biscuit);
		}
		
		System.out.println("..............................................................");
		
		System.out.println("Biscuit Name before changing the position "+biscuitNames[4]);
		biscuitNames[4]="bounce";
		System.out.println("Biscuit Name after changing the position "+biscuitNames[4]);
		System.out.println("............................................................");
		
		
		for(int biscuit=biscuitNames.length-1;biscuit>=0;biscuit--)
		{
			String ref=biscuitNames[biscuit];
			System.out.println("Biscuit Name "+ref+ " index is " +biscuit);
		}
				
	}
}