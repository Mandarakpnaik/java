class Dog extends Animal
{
	public String animalName;
	public int age;
	public char category;
	public float speed;
	public double lifespan;
	public long idNumber;
	public boolean isWild;
	
	public Dog()
	{
	 System.out.println("Dog class  no-argument const");
	}
	public Dog(String animalName,int age,char category ,float speed, double lifespan, long idNumber,boolean isWild)
	{
		this();
		this.age=age;
		this.animalName=animalName;
		this.category=category;
		this.speed=speed;
		this.lifespan=lifespan;
		this.isWild=isWild;
		this.idNumber=idNumber;
	}
	public void displayDog()
	{
	System.out.println("Dog name "+this.animalName);
	System.out.println(super.animalName);
	System.out.println("Dog age "+this.age);
	System.out.println(super.age);
	System.out.println("Dog speed"+this.speed);
	System.out.println(super.speed);
	System.out.println("Dog category"+this.category);
	System.out.println(super.category);
	System.out.println("Dog lifespan"+this.lifespan);
	System.out.println(super.lifespan);
	System.out.println("Dog id Number"+this.idNumber);
	System.out.println(super.idNumber);
	System.out.println("Dog is Wild"+this.isWild);
	System.out.println(super.isWild);
	}
	
}