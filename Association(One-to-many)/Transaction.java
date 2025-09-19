class Transaction
{
	
	public int transactionId;
	public char status;
	public Banks bank;
	public Transaction(int transactionId,char status,Banks bank)
	{
		this.transactionId=transactionId;
		this.status=status;
		this.bank=bank;
	}
	public void displayTransactionDetails()
	{
		System.out.println("Transaction Id :"+transactionId+ ","+ "Transaction status :"+status);
		System.out.println("Bank name :"+bank.bankName+ ","+ "Interest Rate :"+bank.interestRate);
	}
}