class Phones
{
	public static void main(String [] num)
	{
		long jaanu = 9876789098l;
		long sushma = 7867897810l;
		long arun = 9876785614l;
		long vinay = 9876546734l;
		long vidya = 6787867016l;
		long lakshmi = 4680987618l;
	    long chandana =7896578960l;
		
		long [] mobilenumber ={jaanu,sushma,arun,vinay,vidya,lakshmi,chandana};
		System.out.println(mobilenumber[1]);
		
		long vikas = 8907654345l;
		mobilenumber[5]=vikas;
		System.out.println(mobilenumber[5]);
		
	   System.out.println("phone number of the person");
	   for(int number=0; number<mobilenumber.length;number++)
		   System.out.println(mobilenumber[number]);
		   
	 
		   
	}
}