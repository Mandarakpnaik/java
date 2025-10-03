class HumanRunner
{
	public static void main(String [] ref)
	{
		Human human = new Human();
		human.displayHuman(23);
		human.displayHuman(23,"Chandana");
		human.displayHuman(23,"Chandana",678923456789l);
		human.displayHuman(23,"Chandana",678923456789l,97.45f);
		human.displayHuman(23,"Chandana",678923456789l,97.45f,24000);
		human.displayHuman(23,"Chandana",678923456789l,97.45f,24000,'F');
		human.displayHuman(23,"Chandana",678923456789l,97.45f,24000,'F',true);
	}
}