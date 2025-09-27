class Phone
{
	
	public void phone(int price)
	{
		System.out.println("Phone price :"+price);
	}
	public void phone(int price,String name)
	{
		System.out.println("Phone price :"+price+ "," + "Phone name :"+name);
	}
	public void phone(int price,String name,long number)
	{
		System.out.println("Phone price :"+price+ ","+ "Phone name :"+name+ ","+ "Phone number:"+number);
	}
	public void phone(int price,String name,long number,char type)
	{
	   System.out.println("Phone price :"+price+ ","+ "Phone name :"+name+ ","+ "Phone number:"+number+ ","+"Phone type :"+type);	
	}
	public void phone(int price,String name,long number,char type,double cameraPixels)
	{
		 System.out.println("Phone price :"+price+ ","+ "Phone name :"+name+ ","+ "Phone number:"+number+ ","+"CameraPixels :"+cameraPixels +","+"Phone type :"+type);
	}
	public void phone(int price,String name,long number,double cameraPixels,char type,float screenSize)
	{
		System.out.println("Phone price :"+price+ ","+ "Phone name :"+name+ ","+ "Phone number:"+number+ ","+"CameraPixels :"+cameraPixels +","+"Phone type :"+type+ ","+ "Screen size :"+screenSize);
	}
	public void phone(int price,String name,long number,double cameraPixels,char type,float screenSize,boolean isSmartphone)
	{
		System.out.println("Phone price :"+price+ ","+ "Phone name :"+name+ ","+ "Phone number:"+number+ ","+"CameraPixels :"+cameraPixels +","+"Phone type :"+type+ ","+ "Screen size :"+screenSize+ ","+ "phone is Smartphone :"+isSmartphone);
	}
}