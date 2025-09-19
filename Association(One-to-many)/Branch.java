class Branch
{
	public String branchName;
	public int employees;
	public Banks bank;
	
	public Branch(String branchName,int employees,Banks bank)
	{
		this.bank=bank;
		this.branchName=branchName;
		this.employees=employees;
	}
	public void displayBranchDetails()
	{
		System.out.println("Branch name :"+branchName+ ","+ "Employees :"+employees);
		System.out.println("Bank name :"+bank.bankName+ ","+ "Interest Rate :"+bank.interestRate);
	}
}