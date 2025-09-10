class Egg
{
	public boolean[] isFresh = {true,true,false,true,false};
	public void displayFresh()
	{
		int egg = isFresh.length;
		System.out.println(isFresh.length);
		for(int good=0;good<isFresh.length;good++)
		{
			System.out.println(isFresh[good]);
		}
	}
}