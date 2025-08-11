class Banks
{
	public static void main(String [] num)
	{
		double  bankOfBaroda = 78654.787;
		double  bankOfIndia = 847833.789;
		double  canara = 945677.790;
		double  hdfc  = 679636.567;
		double  icic  = 563456.67;
		
		double [] amount ={bankOfBaroda,bankOfIndia,canara,hdfc,icic};
		System.out.println(amount[3]);
		
		double axis = 456784.455;
		amount[0]=axis;
		System.out.println(amount[0]);
		
		System.out.println("Amount of the Banks");
		for(int savings=0; savings<amount.length;savings++)
			System.out.println(amount[savings]);
	}
}