class EmployeeDetailes
{
	public int employeeSalary;
	public String employeeName;
	
	public EmployeeDetailes(int employeeSalary,String employeeName)
	{
		this.employeeSalary =employeeSalary;
		this.employeeName=employeeName;
	}
	public void employeeDetailes()
	{
		System.out.println("Employee salary:"+employeeSalary);
		System.out.println("Employee name :"+employeeName);
	}
}