class BankRunner
{
	public static void main(String [] ref)
	{
		Bank bank = new Bank();
		RBI rbi = new RBI();
		bank.displayName(rbi);
	}
}