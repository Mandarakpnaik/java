class Animals
{
    public Animals(int age)
    {
        System.out.println(age);
    }
    public Animals(int age,String name)
    {
        System.out.println(age);
        System.out.println(name);
    }
    public Animals(int age,String name,boolean isWild)
    {
        System.out.println(age);
        System.out.println(name);
        System.out.println(isWild);
    }
    public Animals(int age,String name,boolean isWild,long population)
    {
        System.out.println(age);
        System.out.println(name);
        System.out.println(isWild);
        System.out.println(population);
    }
    public Animals(int age,String name,long population,char category,boolean isWild)
    {
	    System.out.println(age);
	    System.out.println(name);
	    System.out.println(population);
	    System.out.println(category);
	    System.out.println(isWild);
	
    }
    
     public Animals(int age,String name,char category,boolean isWild,long population){
        System.out.println(age);
        System.out.println(name);
        System.out.println(category);
        System.out.println(isWild);
        System.out.println(population);
    }
	public Animals(String name)
    {
        System.out.println(name);
    }
    public Animals(String name,int age)
	{
	    System.out.println(name);
	    System.out.println(age);
    }
}