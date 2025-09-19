class Account
{
	public String accountHolderName;
	public boolean isAccountActive;
	public Banks bank;
	
	public Account(String accountHolderName,boolean isAccountActive,Banks bank)
	
	{
		this.accountHolderName=accountHolderName;
		this.isAccountActive=isAccountActive;
		this.bank=bank;
	}
	public void displayAccountDetails()
	{
		System.out.println("Account holderName  :"+accountHolderName+ ","+ "Account Active :"+isAccountActive);
		System.out.println("Bank name :"+bank.bankName+ ","+ "Interest Rate :"+bank.interestRate);
	}
}