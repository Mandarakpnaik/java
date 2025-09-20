class Milkshake
{
	public String milkshakeName;
	public boolean isCold;
	public Sugar sugar;
	public IceCream cream;
	public Dryfruit fruit;
	public Milkshake(String milkshakeName,boolean isCold,Sugar sugar,IceCream cream,Dryfruit fruit)
	{
		this.milkshakeName=milkshakeName;
		this.isCold=isCold;
		this.sugar=sugar;
		this.fruit=fruit;
		this.cream=cream;
		
	}
	public void displayMilkshakeDetails()
	{
		System.out.println("Milkshake name :"+milkshakeName+ ","+ "Milkshake is cold :"+isCold);
		System.out.println("Sugar quality :" +sugar.quality+ ","+"Sugar total Stock :"+sugar.totalStock);
		System.out.println("IceCream price :"+cream.price+ ","+ "IceCream flavor :"+cream.flavor);
		System.out.println("Dryfruit name :"+fruit.name+ ","+ "Dryfruit is Imported :"+fruit.isImported);
	}
}