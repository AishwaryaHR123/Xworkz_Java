class Flight{
	public static void main(String[] args){
		String vistara="Vistara";
		String indigo="IndiGo";
		String spiceJet="SpiceJet";
		String goAir="GoAir";
		String turboMegha="Turbo Megha";
		String airIndia="AirIndia Express";
		String jetBlue="Jet Blue";
		String[] flightnames={vistara,indigo,spiceJet,goAir,turboMegha,airIndia,jetBlue};
		int total=flightnames.length;
		
		for(int flight=0;flight<flightnames.length;flight++)
		{
			String ref=flightnames[flight];
			System.out.println("Flightname "+ref+ " index is "+flight);
		}
		System.out.println("...................................................................");
		
		System.out.println("Flight names before changing the positon "+flightnames[5]);
		flightnames[5]="Go First";
		System.out.println("Flight names after changing the positon "+flightnames[5]);
		System.out.println("...................................................................");
		
		for(int flight=flightnames.length-1;flight>=0;flight--)
		{
			String ref=flightnames[flight];
			System.out.println("Flightname "+ref+ " index is "+flight);
		}
	}
}

		