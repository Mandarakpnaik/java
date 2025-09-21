class Milkshake
{
	public String milkshakeName;
	public boolean isCold;
	public Sugar sugar;
	public Milk milk;
	public Ice ice;
	
	public Milkshake(String milkshakeName,boolean isCold,Sugar sugar,Milk milk,Ice ice)
	{
		this.milkshakeName=milkshakeName;
		this.isCold=isCold;
		this.sugar=sugar;
		this.milk=milk;
		this.ice=ice;
		
	}
	public void displayMilkshakeDetails()
	{
		System.out.println("Milkshake name :"+milkshakeName+ ","+ "MilkShake is cold :"+isCold);
		System.out.println("Number of Spoons sugar :"+sugar.noOfSpoons+ ","+ "Sugar Less :"+sugar.isSugarLess);
		System.out.println("Milk price :"+milk.price+ ","+ "Milk is fresh :"+milk.isFresh);
		System.out.println("Ice brand :"+ice.brand+ ","+"Ice is Frozen :"+ice.isFrozen);
		
	}
}