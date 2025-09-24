class Manager extends Employee
{
	public void displayManager()
	{
		employeeName="Sushma k Nayaka";
		salary=45000;
		System.out.println(employeeName);
		System.out.println(salary);
		displayEmployee();
	}
	public static void displayManagerDetails()
	{
		salary=35000;
		System.out.println(salary);
	}
}