class FoodRunner
{
	public static void main(String [] ref)
	{
		Salt salt = new Salt("Tata Salt",50.346);
		Salt value = new Salt("Aashirvaad Salt",45.23);
		ChickenBiryani biryani = new ChickenBiryani(250,true,salt);
		Dosa dosa = new Dosa("udupi hotel",70,value);
		
		biryani.displayChickenBiryaniDetails();
		dosa.displayDosaDetails();
		
	}
}