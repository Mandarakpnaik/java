class Animals
{
    public Animals()
	{
	   this(3);
	}
    public Animals(int age)
    {
		this(3,"Cat");
        System.out.println(age);
    }
    public Animals(int age,String name)
    {
		this(4,"Dog",false);
        System.out.println(age);
        System.out.println(name);
    }
    public Animals(int age,String name,boolean isWild)
    {
		this(2,"lion",true,239890987l);
        System.out.println(age);
        System.out.println(name);
        System.out.println(isWild);
    }
    public Animals(int age,String name,boolean isWild,long population)
    {
		this(6,"Cat",true,67895433l,'A');
        System.out.println(age);
        System.out.println(name);
        System.out.println(isWild);
        System.out.println(population);
    }
    public Animals(int age,String name,boolean isWild,long population,char category)
    {
		this(4,"lion",true,98743l,'A',45789.566);
	    System.out.println(age);
	    System.out.println(name);
	    System.out.println(population);
	    System.out.println(category);
	    System.out.println(isWild);
	
    }
	public Animals(int age,String name,boolean isWild,long population,char category,double price)
    {
		this(4,"Dog",false,67890133l,'A',5578.68,1.4f);
	    System.out.println(age);
	    System.out.println(name);
	    System.out.println(population);
	    System.out.println(category);
	    System.out.println(isWild);
		System.out.println(price);
	
    }
	public Animals(int age,String name,boolean isWild,long population,char category,double price,float height)
    {
	    System.out.println(age);
	    System.out.println(name);
	    System.out.println(population);
	    System.out.println(category);
	    System.out.println(isWild);
		System.out.println(price);
		System.out.println(height);
	
    }

}