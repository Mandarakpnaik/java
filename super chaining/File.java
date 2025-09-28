class File
{
	public String fileName;
	public int sizeKB;
	public long fileId;
	public float accessTime;
	public double storageUsed;
	public char fileType;
	public boolean isReadOnly;
	
	public File()
	{
		System.out.println("This is File no-argument const");
	}
}