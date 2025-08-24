class SolarSystem
{
	public static String planetCount(String name,int count)
	{
		if( count == 7 && name =="earth" )
		{
			
			System.out.println("Correct count ");
		}else
		{
		
			System.out.println("Incorrect count");
		}
		return name;
	}
	public static String planetPosition(int number,String names)
	{
		if( number == 3 && names =="Earth" )
		{
			
			System.out.println("Correct earth position is 3rd  ");
		}else
		{
		
			System.out.println("Incorrect planet");
		}
		return names;
	}
	public static double planetTemperature(double temp,int number)
	{
		if( temp == 34567.987 && number == 2 )
		{
			
			System.out.println("venus temperature ");
		}else
		{
		
			System.out.println("Incorrect planet temperature");
		}
		return temp;
	}
	public static String rings(int number,String planetName)
	{
		if( number == 6 && planetName == "saturn" )
		{
			
			System.out.println("saturn has rings");
		}else
		{
		
			System.out.println("planet does not have rings");
		}
		return planetName;
	}
	  
	  
	public static void system(String name,int number)
       
     {

         if (name== "neptun" && number==8)
        {
           number=8;
        System.out.println("what is place of neptun");
        }else 
         {
	    number=2;
	     System.out.println("it is not a plante");

         }
          System.out.println(number);
     }
    public static int earth(String color,int distence)
     {
  
        if (color== "green" && distence==993)
        {
            distence=993;
           System.out.println("what is the distence of earth to earth");

         }
            else 
        {
	       distence=9;
	     System.out.println("it is not a plante");
        }
           return distence;
        }
		
	 public static int planetNames(String name,int size)
    {

        if (name== "marse" && size==144)
        {
         size=144;
         System.out.println("marse");

        }
        else 
         {
	       size=9;
	      System.out.println("it is not a plante");
         }
          return  size;
    }

	public static double smallPlante(String name,double sizes)
    {

         if (name== "mercury" && sizes==74.8)
         {
         sizes=74.8;
         System.out.println("what is size of mercury");
         }
           else 
         {
	      sizes=22.4;
	     System.out.println("it is not a size of mercury");
        }
           return sizes;
	
	
        }
		
		
     public static int planet(String name,int postion)
     
    {

        if (name== "veens" && postion==2)
         
		{
          postion=2;
          System.out.println("what is postion of veens");

        }
        else 
         
		{
	      postion=0;
	      System.out.println("it is not a plante");
        }
        return postion;
    }
	public static void moonSize(String name,int size)
    {

        if (name== "moon" && size==1740)
        {
          size=1740;
          System.out.println("what is size of moon");

        }
        else 
        {
	     size=9;
	      System.out.println("it is not a plante");
         }
      System.out.println(size);
	}
	
}
	
	
	

