class TextFile extends File
{
	public String fileName;
	public int sizeKB;
	public long fileId;
	public float accessTime;
	public double storageUsed;
	public char fileType;
	public boolean isReadOnly;
	
	public TextFile()
	{
		super();
		System.out.println("This is TextFile no-argument const");
	}
	public TextFile(String fileName)
	{
		this();
		this.fileName=fileName;
		super.fileName=fileName;
		
	}
	public TextFile(String fileName,int sizeKB,long fileId,float accessTime,double storageUsed,char fileType,boolean isReadOnly)
	{
		super.fileName=fileName;
		super.sizeKB=sizeKB;
		super.fileId=fileId;
		super.isReadOnly=isReadOnly;
		super.storageUsed=storageUsed;
		super.fileType=fileType;
		super.accessTime=accessTime;
		this.fileName=fileName;
		this.isReadOnly=isReadOnly;
		this.sizeKB=sizeKB;
		this.fileId=fileId;
		this.accessTime=accessTime;
		this.storageUsed=storageUsed;
		this.fileType=fileType;
	}
	public void displayTextFile()
	{
		System.out.println("TextFile name :"+this.fileName);
		System.out.println("TextFile sizeKB : "+this.sizeKB);
		System.out.println("TextFile id :"+this.fileId);
		System.out.println("TextFile accessTime :"+this.accessTime);
		System.out.println("TextFile storage Used :"+this.storageUsed);
		System.out.println("TextFile file Type :"+this.fileType);
		System.out.println("TextFile is ReadOnly :"+this.isReadOnly);
		System.out.println(super.fileName);
		System.out.println(super.sizeKB);
		System.out.println(super.storageUsed);
		System.out.println(super.accessTime);
		System.out.println(super.fileId);
		System.out.println(super.isReadOnly);
		System.out.println(super.fileType);
	}
}