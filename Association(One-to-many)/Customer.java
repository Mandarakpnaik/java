class Customer
{
	public String customerName ;
	public int customerAge;
	public Banks bank;
	
	public Customer(String customerName,int customerAge,Banks bank)
	{
		this.customerAge=customerAge;
		this.customerName=customerName;
		this.bank=bank;
	}
	public void displayCustomerDetails()
	{
		System.out.println("Customer Name :"+customerName+ ","+ "Customer age :"+customerAge);
		
		System.out.println("Bank name :"+bank.bankName+ ","+ "Interest Rate :"+bank.interestRate);
	}
}