class MobilePhoneRunner
{
	public static void main(String [] ref)
	{
		GalleryApp gallery=new GalleryApp(1650,45.4f);
		MusicApp music=new MusicApp(4678124l,true);
		NetMirrorApp netMirror = new NetMirrorApp(3201,"NetMirror Pro");
		
		MobilePhone mobile =new MobilePhone("Sumsung",39899.990,gallery,music,netMirror);
		mobile.displayMobilePhoneDetails();
	}
}