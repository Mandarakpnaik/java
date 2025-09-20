class MilkshakeRunner
{
	public static void main(String [] ref)
	{
	  Sugar sugar = new Sugar('A',507800l);
	  IceCream iceCream =new IceCream(80,"vanilla");
	  Dryfruit dryFruit = new Dryfruit("Almonds",false);
	  
	  Milkshake milkshake = new Milkshake("Mango",true,sugar,iceCream,dryFruit);
	
      milkshake.displayMilkshakeDetails();	
	}
}