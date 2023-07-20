class JobMain{
	public static void main(String[] args)
	{
		Job.apply();
		Job.apply("Aishu",5);
		Job.apply("infosys",4,"xworkz");
		Job.apply(7);
		Job.rejectOffer();
		
		System.out.println("..........................................................");
		
		Resume.format();
		Resume.format("profile");
		Resume.format("combination",2);
		Resume.clear();
		Resume.delete();
	}
}