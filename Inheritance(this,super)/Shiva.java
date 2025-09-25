class Shiva  extends God
{
	public String godName;
	public int devatees;
	public char symbol;
	public float height;
	public double powerLevel;
	public long idols;
	public boolean isWorshipped ;
	
	public Shiva()
	{
		System.out.println("Shiva class  no-argument const");
	}
	 Shiva( String godName,int devatees,char symbol,float height,double powerLevel,long idols,boolean isWorshipped)
	{
		super();
		this.godName=godName;
		this.devatees=devatees;
		this.symbol=symbol;
		this.height=height;
		this.powerLevel=powerLevel;
		this.idols=idols;
		this.isWorshipped=isWorshipped;
	}
	public void displayShiva()
	{
	System.out.println(this.godName);
	System.out.println(super.godName);
	System.out.println(this.devatees);
	System.out.println(super.devatees);
	System.out.println(this.idols);
	System.out.println(super.idols);
	System.out.println(this.powerLevel);
	System.out.println(super.powerLevel);
	System.out.println(this.isWorshipped);
	System.out.println(super.isWorshipped);
	System.out.println(this.height);
	System.out.println(super.height);
	System.out.println(this.symbol);
	System.out.println(super.symbol);
	}
}