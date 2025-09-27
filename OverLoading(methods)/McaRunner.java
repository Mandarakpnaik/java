class McaRunner
{
    public static void main(String [] ref)
	{
		Mca mca = new Mca();
		mca.displayMca(450);
		mca.displayMca(450,78542672l);
		mca.displayMca(450,"Java",6789087908l);
		mca.displayMca(450,78542672l,"Java",81.33f);
		mca.displayMca(450,78542672l,"Java",81.33f,35000.34);
		mca.displayMca(450,78542672l,"Java",81.33f,35000.34,'A');
		mca.displayMca(450,78542672l,"Java",81.33f,35000.34,'A',true);
		
		
	}
}