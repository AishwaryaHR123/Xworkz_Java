class Grocery{
	public static void main(String[] args)
	{
		System.out.println("Grocery items info: ");
		String rice="Rice";
		String flour="Flour";
		String sugar="Sugar";
		String rava="Rava";
		String jaggery="Jaggery";
		String dal="Chana Dal";
		String salt="Salt";
		String[] groceries={rice,flour,sugar,rava,jaggery,dal,salt};
		int total=groceries.length;
		
		for(int grocery=0; grocery<groceries.length;grocery++)
		{
			String ref=groceries[grocery];
			System.out.println("Grocery item " + ref + "index is " +grocery);
		}
		System.out.println("................................................");
		
		System.out.println("groceryitem before changing the position " +groceries[5]);
		groceries[5]="oil";
		System.out.println("groceryitem after changing the position:"+groceries[5]);
		System.out.println("..............................................");
		
		for(int grocery= groceries.length-1;grocery>=0;grocery--)
		{
			String ref=groceries[grocery];
			System.out.println("Grocery item " + ref + " index is " +grocery);
		}
			
	}
}
