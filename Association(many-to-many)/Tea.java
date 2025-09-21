class Tea
{
	public String brand;
	public int price;
	public Sugar sugar;
    public Milk milk;
	public Ice ice;
	
	public Tea(String brand,int price,Sugar sugar,Milk milk,Ice ice)
	{
		this.ice=ice;
		this.sugar=sugar;
		this.brand=brand;
		this.milk=milk;
		this.price=price;
	}
	public void displayTeaDetails()
	{
		System.out.println("Tea brand :"+brand+ ","+ "Tea price :"+price);
		System.out.println("Number of Spoons sugar :"+sugar.noOfSpoons+ ","+ "Sugar Less :"+sugar.isSugarLess);
		System.out.println("Milk price :"+milk.price+ ","+ "Milk is fresh :"+milk.isFresh);
		System.out.println("Ice brand :"+ice.brand+ ","+"Ice is Frozen :"+ice.isFrozen);
	}
}