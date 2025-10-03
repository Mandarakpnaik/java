class BcaRunner
{
    public static void main(String [] ref)
	{
		Bca bca = new Bca();
		bca.displayBca(450);
		bca.displayBca(450,78542672l);
		bca.displayBca(450,"Java",6789087908l);
		bca.displayBca(450,78542672l,"Java",81.33f);
		bca.displayBca(450,78542672l,"Java",81.33f,35000.34);
		bca.displayBca(450,7854267l,"Java",81.33f,35000.34,'A');
		bca.displayBca(450,78542672l,"Java",81.33f,35000.34,'A',true);
		
		
	}
}