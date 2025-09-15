class Website
{
	public int websiteId;
	public String name ;
	
	public Website(int websiteId,String name)
	{
		this.websiteId = websiteId;
		this.name= name;
	}
	public void websiteDetalies()
	{
		System.out.println("website Id:"+websiteId);
		System.out.println("website name :"+name);
	}
}