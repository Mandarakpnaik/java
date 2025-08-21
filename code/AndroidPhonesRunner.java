class AndroidPhonesRunner
{
	public static void main(String [] ref)
	{
		int[] years = {2021,2020,2001,2025};
		int[] models = AndroidPhones.modelYears(years);
		
		for(int year=0;year<years.length;year++)
		{
			System.out.println(years[year]);
		}
		
		long[] imei ={45867455765l,6765437987654l,98764125680l,689886765543l};
		long[] number =AndroidPhones.imeiNumbers(imei);
		
		for(int phone=0;phone<imei.length;phone++)
		{
			System.out.println(imei[phone]);
		}
		double[] price = {67665.67,2345.988,9767.9890,56546.67};
		double[]  value =AndroidPhones.phonePrices(price);
		
		for(int num=0;num<price.length;num++)
		{
			System.out.println(price[num]);
		}
		char[] colors = {'M','M','F','M','F'};
		char[] charater = AndroidPhones.phoneColors(colors);
		
		for(int charaters=0;charaters<colors.length;charaters++)
		{
			System.out.println(colors[charaters]);
		}
		float[] battery ={45.4f,67.5f,22.2f,39.6f};
		float[] numbers =AndroidPhones.phoneBattery(battery);
		
		for(int phoneBattery=0;phoneBattery<battery.length;phoneBattery++)
		{
			System.out.println(battery[phoneBattery]);
			
		}
		boolean[]  support5G= {true,false,false,true};
		boolean[] is5G =AndroidPhones.isSupport5G(support5G);
		
		for(int word=0;word<support5G.length;word++)
		{
			System.out.println(support5G[word]);
			
		}
		
		String[] brands={"realme","OnePlus","Sumsung","vivo"};
		String[] phoneBrand =AndroidPhones.phoneBrands(brands);
		
		for(int words=0;words<brands.length;words++)
		{
			System.out.println(brands[words]);
		}
	}
}
