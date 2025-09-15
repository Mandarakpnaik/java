class CompanyRunner
{
	public static void main(String [] ref)
	{
		Company company = new Company();
		EmployeeDetailes names = new EmployeeDetailes(45000,"Rakesh");
		EmployeeDetailes values = new EmployeeDetailes(38000,"Kavya");
		EmployeeDetailes num = new EmployeeDetailes(32000,"prasad");
		EmployeeDetailes value = new EmployeeDetailes(55678,"Bhoomika");
		EmployeeDetailes [] employees = {names,values,num,value};
		company.companyDetalies(employees);
	}
}