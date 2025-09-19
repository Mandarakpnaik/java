class BankDetails
{
	public static void main(String [] ref)
	{
		Banks bank = new Banks("State Bank of India",5.3f);
		Banks banks=new Banks("",4.9f);
		Banks newBank = new Banks("",6.9f);
		
		Customer customer = new Customer("Arun M",26,bank);
		Account account = new Account("Navya ",true,banks);
		Loan loan = new Loan(1023,500000l,newBank);
		Staffs staff = new Staffs("Rahul Verma ",false,newBank);
		Branch branch = new Branch("MG Road Branch ",150,bank);
		Transaction transaction = new Transaction(701,'S',banks);
		
		customer.displayCustomerDetails();
		System.out.println("---------------------------------------------------------------");
		account.displayAccountDetails();
		System.out.println("---------------------------------------------------------------");
		loan.displayLoanDetails();
		System.out.println("---------------------------------------------------------------");
		transaction.displayTransactionDetails();
		System.out.println("---------------------------------------------------------------");
		staff.displayStaffsDetails();
		System.out.println("---------------------------------------------------------------");
		branch.displayBranchDetails();
	}
}