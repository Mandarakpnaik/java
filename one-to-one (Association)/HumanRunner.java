class HumanRunner
{
	public static void main(String [] ref)
	{
		Heart heart = new Heart(100000,true);
		Human human = new Human("Sushma",23,'F',heart);
		human.displayHumanDetails();
		
	}
}