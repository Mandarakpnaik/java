class Sudeep extends Hero
{
	public String heroName;
	public int age;
	public long netWorth;
	public float height;
	public double weight;
	public char initial;
	public boolean isSuperHero;
	
	public Sudeep()
	{
		System.out.println("Sudeep class  no-argument const");
	}
	public Sudeep(String heroName,int age,long netWorth,float height,double weight,char initial,boolean isSuperHero)
	{
		super.height=height;
		super.heroName=heroName;
		super.weight=weight;
		super.netWorth=netWorth;
		super.isSuperHero=isSuperHero;
		super.initial=initial;
		super.age=age;
		this.height=height;
		this.heroName=heroName;
		this.netWorth=netWorth;
		this.weight=weight;
		this.isSuperHero=isSuperHero;
		this.age=age;
		this.initial=initial;
	}
	public void displaySudeep()
	{
	System.out.println("Hero name "+this.heroName);
	System.out.println("Hero name "+super.heroName);
	System.out.println("Sudeep age "+this.age);
	System.out.println("age :"+super.age);
	System.out.println("Sudeep weight "+this.weight);
	System.out.println("weight "+super.weight);
	System.out.println("Sudeep initial "+this.initial);
	System.out.println("initial "+super.initial);
	System.out.println("Sudeep netWorth "+this.netWorth);
	System.out.println("Net worth "+super.netWorth);
	System.out.println("Sudeep weight "+this.height);
	System.out.println("height "+super.height);
	System.out.println("Sudeep is Super Hero "+this.isSuperHero);
	System.out.println("isSuperHero "+super.isSuperHero);
	}
}