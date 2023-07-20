class ContractorMain{
	public static void main(String[] args)
	{
		Contractor.construction();
		Contractor.construction("Building");
		Contractor.construction("Building",10);
		Contractor.renovation("Building");
		Contractor.renovation("Building",50000);
		Contractor.plumbing(5000,"pipe");
		Contractor.electrical("wire");
		Contractor.roofing();
		Contractor.flooring(10000);
		Contractor.address();
		Contractor.experience(15);
		Contractor.demolition("building");
		Contractor.carpentry();
	}
}