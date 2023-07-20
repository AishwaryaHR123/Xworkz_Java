class Resume{
	static void format(){
		String type="profile";
		int pages=1;
		System.out.println("invoking resume in format:");
		System.out.println("Resume type :" +type);
		System.out.println("ResumePages :" +pages);
	}
	static void format(String type)
	{
		System.out.println("invoking resume in format:");
		System.out.println("invoking format(type) in format :"+type);
	}
	static void format(String type,int pages)
	{
		System.out.println("invoking resume in format:");
		System.out.println("invoking format(type) in format :"+type);
		System.out.println("invoking format(pages) in format :"+pages);
	}
	static void clear()
	{
		System.out.println("invoking clear in Resume:");
	}
	static void delete()
	{
		System.out.println("invoking delete in Resume:");
	}
		
	
		
}
	
		
		
