class SocialMediaRunner
{
	public static void main(String [] ref)
	{
		
	   String[] names = {"Facebook", "Instagram", "Snapchat"};
	   String[] platforms = SocialMedia.platformNames(names);
       
	   for(int words=0; words<platforms.length; words++)
		{
            System.out.println(platforms[words]);
        }

        int[] years = {2004, 2010,  2011};
        int[] launchYears = SocialMedia.launchYears(years);
       
     	for(int year=0; year<launchYears.length; year++) 
		{
            System.out.println(launchYears[year]);
        }

        long[] users = {2900000000L, 2000000000L, 400000000L};
        long[] activeUsers = SocialMedia.activeUsers(users);
       
   	    for(int active=0; active<activeUsers.length; active++)
		{
            System.out.println(activeUsers[active]);
        }
		
		double[] amount = {116.6, 561.4, 587.761};
        double[] companyTotal = SocialMedia.companyTotalAmount(amount);
        
		for(int total=0; total<amount.length; total++) 
		{
            System.out.println(amount[total]);
        }

        float[] ratings = {4.2f, 4.4f, 4.1f};
        float[] appRatings = SocialMedia.appRatings(ratings);
        
		for(int apps=0; apps<ratings.length; apps++) 
		{
            System.out.println(ratings[apps]);
        }

        char[] logos = {'F', 'I', 'S'}; 
        char[] appLogos = SocialMedia.appLogos(logos);
        
		for(int logo=0; logo<appLogos.length; logo++) 
		{
            System.out.println(appLogos[logo]);
        }

        boolean[] popular = {true, true, true};
        boolean[] isPopular = SocialMedia.isPopular(popular);
		
        for(int word=0; word<isPopular.length; word++)
		{
            System.out.println(isPopular[word]);
        }
	}
}