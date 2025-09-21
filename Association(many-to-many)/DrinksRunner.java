class DrinksRunner
{
	public static void main(String [] ref)
	{
		Sugar sugar = new Sugar(2,true);
		Sugar blackSugar = new Sugar(1,true);
		Sugar brownSugar = new Sugar(3,false);
		
		Milk milk =new Milk(22.34,true);
		Milk milks=new Milk(18.23,true);
		
		Ice ice=new Ice(true,"Crystal Ice");
		Ice ices = new Ice(false,"Crystal");
		
		Tea tea = new Tea("Tetley",150,sugar,milk,ice);
		
		Milkshake milkShake = new Milkshake("Strawberry",true,blackSugar,milks,ices);

        Coffee coffe =new Coffee("Cold Coffe",true,brownSugar,milk,ices);

        tea.displayTeaDetails();
		System.out.println("-------------------------------------------");
		milkShake.displayMilkshakeDetails();
		System.out.println("-------------------------------------------");
		coffe.displayCoffeeDetails();
	 
	}
}