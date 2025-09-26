class UniversityRunner
{
	public static void main(String [] ref)
	{
		Departments departments = new Departments("CS",150);
		University university = new University("Banglore University",4,departments);
		university.displayUniversityDetails();
	}
}