class Earth extends Planet
{
	public String planetColor;
	public int diameter;
	public char initial ;
	public float gravity;
	public double distanceFromSun;
	public long  population;
	public boolean hasLife ;
	
	
	public Earth()
	{
		System.out.println("Earth class  no-argument const");
	}
	public Earth(String planetColor,int diameter,char initial ,float gravity, double distanceFromSun,long  population,boolean hasLife)
	{
		this();
		this.planetColor=planetColor;
		this.diameter=diameter;
		this.initial=initial;
		this.gravity=gravity;
		this.distanceFromSun=distanceFromSun;
		this.population=population;
		this.hasLife=hasLife;
	}
	public void displayEarth()
	{
	System.out.println(this.planetColor);
	System.out.println(super.planetColor);
	System.out.println(this.diameter);
	System.out.println(super.diameter);
	System.out.println(this.initial);
	System.out.println(super.initial);
	System.out.println(this.gravity);
	System.out.println(super.gravity);
	System.out.println(this.distanceFromSun);
	System.out.println(super.displayEarth);
	System.out.println(this.population);
	System.out.println(super.population);
	System.out.println(this.hasLife);
	System.out.println(super.hasLife);
	}
}