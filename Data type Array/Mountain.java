class Mountain
{
	public static void main(String [] ref)
	{
		String[] mountainNames={"Everest","Nanga parbat","Aravalli"};
		int[] climbRoutes={5,8,3};
		long[] uniqueIds={10019l,34567l,87698l};
		float[] temperatures={-10.5f,-5.2f,2.34f};
		double[] peakHeights={8867.6,779996.566,444.23};
		char[] difficultyLevels={'H','M','E'};
		boolean[] isSnowCapped={true,true,false};
		
		System.out.println("Mountain names");
		for(int name=0;name<mountainNames.length;name++)
		{
			System.out.println(mountainNames[name]);
		}
		
		System.out.println("Mountain routes");
		
		for(int routes=0;routes<climbRoutes.length;routes++)
		{
			System.out.println(climbRoutes[routes]);
		}
		
		System.out.println("Mountain uniqueIds ");
		
		for(int id=0;id<uniqueIds.length;id++)
		{
			System.out.println(uniqueIds[id]);
		}
		
		System.out.println("Mountain temperatures");
		
		for(int temp=0;temp<temperatures.length;temp++)
		{
			System.out.println(temperatures[temp]);
		}
		System.out.println("Mountain peakHeights ");
		
		for(int heights=0;heights<peakHeights.length;heights++)
		{
			System.out.println(peakHeights[heights]);
		}
		System.out.println("Mountain difficulty Levels");
		for(int levels=0;levels<difficultyLevels.length;levels++)
		{
			System.out.println(difficultyLevels[levels]);
		}
		System.out.println("Mountain isSnow Capped ");
		
		for(int snow=0;snow<isSnowCapped.length;snow++)
		{
			System.out.println(isSnowCapped[snow]);
		}
	}
}