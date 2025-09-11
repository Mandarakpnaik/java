class KingRunner
{
	public static void main(String [] ref)
	{
		King king = new King();
		int value =king.displaysoldiers();
		System.out.println(value);
		char symbol = king.displaySymbol();
		System.out.println(symbol);
		long area= king.displaykingdomArea();
		System.out.println(area);
		double treasury = king.displaytreasury();
		System.out.println(treasury);
		float rate = king.displaytaxRate();
		System.out.println(rate);
		boolean power = king.displayisPowerful();
		System.out.println(power);
		String name= king.displayName();
		System.out.println(name);
	}
}