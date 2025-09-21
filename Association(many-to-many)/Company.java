class Company
{
	public int employeeCount;
	public float marketShare;
	public Employees employee;
	public Owners owner;
	public Investments invest;
	public Company(int employeeCount,float marketShare,Employees employee,Owners owner,Investments invest)
	{
		this.employee=employee;
		this.owner=owner;
		this.invest=invest;
		this.marketShare=marketShare;
		this.employeeCount=employeeCount;
	}
	public void displayCompanyDetails()
	{
		System.out.println("Company count :"+employeeCount+ ","+ "Company market Share:"+marketShare);
		System.out.println("Employees name :"+employee.employeeName+ ","+ "Employees is Permanent:"+employee.isPermanent);
		System.out.println("Owner name :"+owner.ownerName+ ", "+ "owner age :"+owner.age);
		System.out.println("investor Name :"+invest.investorName+ ","+ "Investment amount :"+invest.amount);
	}
}