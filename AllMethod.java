class AllMethod{
	public static void main(String[] args)
	{
		System.out.println("Running mian in AllMainMethod");
		Wood wood1=new Wood("Window",300d,"Oak",6.67f,5.67f);
		Wood wood2=new Wood("Window",300,"Oak");
		Wood wood3=new Wood("Window");
		
		System.out.println(".................................................");
		MallKiller mall1=new MallKiller("orion","SandalSoap Factory","Peter-England",1000,50,true,9);
		MallKiller mall2=new MallKiller("Orion","SandalSoap Factory","peter-England");
		MallKiller mall3=new MallKiller("Orion","SandalSoap Factory");
		
		System.out.println(".................................................");
		ParkKiller park1=new ParkKiller("cubbon Park",100,"Vidhana Soudha",50,"Walking Trails",5,3,"Sports",true);
		ParkKiller park2=new ParkKiller("cubbon Park",100,"Vidhana Soudha",50);
		ParkKiller park3=new ParkKiller("cubbon Park",100);
	}
}