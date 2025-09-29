class Camera
{
	public static void main(String [] ref)
	{
		String[] brandNames={"Canon","Nikon","Sony"};
		int[] megapixels={24,36,50};
		long[] serialNumber={200001l,90000000l,6777777777l};
	    float[] apertureValues={1.5f,2.43f,6.23f};
		double[] sensorSizes={22.12,39.34,53.2};
		char[] cameraType={'D','M','C'};
		boolean[] isAvailable={false,true,true};
		
		System.out.println("Camera brand Names ");
		for(int name=0;name<brandNames.length;name++)
		{
			System.out.println(brandNames[name]);
		}
		System.out.println("Camera megapixels");
		for(int number=0;number<serialNumber.length;number++)
		{
			System.out.println(serialNumber[number]);
		}
		
		System.out.println("Camera aperture Values");
		for(int values=0;values<apertureValues.length;values++)
		{
			System.out.println(apertureValues[values]);
		}
		System.out.println("camera sensor Sizes ");
		for(int size=0;size<sensorSizes.length;size++)
		{
			System.out.println(sensorSizes[size]);
		}
		System.out.println("Camera types");
		for(int type=0;type<cameraType.length;type++)
		{
			System.out.println(cameraType[type]);
		}
		
		System.out.println("camera is Available");
		for(int types=0;types<isAvailable.length;types++)
		{
			System.out.println(isAvailable[types]);
		}
		
	}
}