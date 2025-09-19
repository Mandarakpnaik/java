class Staffs
{
	public String staffName;
	public boolean isPermanent;
	public Banks bank;
	
	public Staffs(String staffName,boolean isPermanent,Banks bank)
	{
		this.staffName=staffName;
		this.isPermanent=isPermanent;
		this.bank=bank;
		
	}
	public void displayStaffsDetails()
	{
		System.out.println("Staff name :"+staffName+ ","+ "Staff is Permanent :"+isPermanent);
		System.out.println("Bank name :"+bank.bankName+ ","+ "Interest Rate :"+bank.interestRate);
	}
}