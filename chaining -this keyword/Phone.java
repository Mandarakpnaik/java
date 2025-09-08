class Phone
{
public Phone()
{
	this("Samsung");
}
public Phone(String phoneName)
{
	this("Apple",120);
	System.out.println("Phone name:"+phoneName);
}
public Phone(String phoneName,int storage)
{
    this("Redmi 12",256,'S');	
	System.out.println("Phone name:"+phoneName);
	System.out.println("Phone storage :"+storage);
}
public Phone(String phoneName,int storage,char simType)
{
	this("onePlus",'D',56779490l,5.5f);
	System.out.println("Phone name:"+phoneName);
	System.out.println("Phone storage :"+storage);
	System.out.println("Phone sim type :"+simType);
}
public Phone(String phoneName,char simType,long imeiNumber,float screenSize)
{
    this("vivo",897539876l,6.5f,64,true);
	System.out.println("Phone name:"+phoneName);
	System.out.println("Phone sim type :"+simType);
	System.out.println("Phone imei Number :"+imeiNumber);
	System.out.println("Phone screen Size :"+screenSize);
}
public Phone(String phoneName,long imeiNumber,float screenSize,int storage,boolean is5G)
{
	this("onePlus",6.4f,128,false,6867.67,'S');
	System.out.println("Phone name:"+phoneName);
	System.out.println("Phone imei Number :"+imeiNumber);
	System.out.println("Phone screen Size :"+screenSize);
	System.out.println("Phone storage :"+storage);
	System.out.println("Phone is 5G :"+is5G);
}
public Phone(String phoneName,float screenSize,int storage,boolean is5G,double price,char simType)
{
	
	this("realme",4.8f,256,true,5678.987,'D',323456l);
	System.out.println("Phone name:"+phoneName);
    System.out.println("Phone screen Size :"+screenSize);
	System.out.println("Phone storage :"+storage);
	System.out.println("Phone is 5G :"+is5G);
	System.out.println("Phone price :"+price);
	System.out.println("Phone sim type :"+simType);
}
public Phone(String phoneName,float screenSize,int storage,boolean is5G,double price,char simType,long imeiNumber)
{
	System.out.println("Phone name:"+phoneName);
    System.out.println("Phone screen Size :"+screenSize);
	System.out.println("Phone storage :"+storage);
	System.out.println("Phone is 5G :"+is5G);
	System.out.println("Phone price :"+price);
	System.out.println("Phone sim type :"+simType);
	System.out.println("Phone imei Number :"+imeiNumber);
}
}