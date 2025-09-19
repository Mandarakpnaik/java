class Loan
{
	public int loanId;
	public long amount;
	public Banks bank;
	
	public Loan(int loanId,long amount,Banks bank)
	{
		this.loanId=loanId;
		this.amount=amount;
		this.bank=bank;
	}
	public void displayLoanDetails()
	{
		System.out.println("Loan Id :"+loanId+ ","+ "Loan amount :"+amount);
		System.out.println("Bank name :"+bank.bankName+ ","+ "Interest Rate :"+bank.interestRate);
	}
	
}