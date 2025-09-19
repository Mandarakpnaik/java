class Boost
{
	public int boostPrice;
	public float shopRating;
	public  Sugar sugar;
	
	public Boost(int boostPrice,float shopRating,Sugar sugar)
	{
		this.boostPrice=boostPrice;
		this.shopRating=shopRating;
		this.sugar=sugar;
	}
	public void displayBoostDetalies()
	{
		System.out.println("Boost price :"+boostPrice+ ","+ "Shop Rating  :"+shopRating);
		System.out.println("Number of spoons :"+sugar.noOfSpoons+ "," +"Tea is sugar less :"+sugar.isSugarLess);
	}
}