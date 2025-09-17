class DosaRunner
{
	public static void main(String [] ref)
	{
		Chatuney chatuney = new Chatuney("Chilly Chatuney");
		Dosa dosa = new Dosa(chatuney);
		System.out.println(dosa.name);
		dosa.displayDosa();
	}
}