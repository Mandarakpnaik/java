class SchoolRunner
{
	public static void main(String [] reg)
	{
		School school = new School();
		Staff number = new Staff(112,"Ramya");
		Staff num = new Staff(123,"Vikas");
		Staff names = new Staff(124,"Navya");
		Staff name = new Staff(134,"Sushma");
		Staff[] values = {number,num,names,name};
		school.schoolDetailes(values);
	}
}