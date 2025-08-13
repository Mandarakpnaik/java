class CompanyRunner
{
public static void main(String [] ref)
{
	int rating = Company.companyRating();
	
	System.out.println(rating);
	
	int cost = Company.companyCost();
	System.out.println(cost);
	
	int number = Company.companyNumber();
	System.out.println(number);
	
	int amount = Company.companySalary();
	System.out.println(amount);
	
	int id = Company.companyId();
	System.out.println(id);

	
}
}