class Staff
{
	public int staffId;
	public String staffName;
	
	public Staff(int staffId,String staffName)
	{
		this.staffId = staffId;
		this.staffName = staffName;
	}
	public void numberOfStaff()
	{
		System.out.println("Staff id :"+staffId);
		System.out.println("Staff name :"+staffName);
	}
}