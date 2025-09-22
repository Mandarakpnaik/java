class SubjectRunner
{
	public static void main(String [] ref)
	{
		Sushma sushma = new Sushma(23,9078956784l);
		Sushma number = new Sushma(24,8912345754l);
		Sushma num = new Sushma(26,7867909675l);
		Prasad prasad = new Prasad(28,6789098765l);
		Prasad value = new Prasad(29,675434568l);
		Prasad values = new Prasad(30,7890642112l);
		Kavya kavya = new Kavya(18,9087612345l);
		Kavya sub=new Kavya(28,7896543210l);
		
		
		Science science = new Science("Naveen M ",45789.5666,sushma,prasad,kavya);
		Mathamatics maths = new Mathamatics("Chethan ",35987.766,number,value,sub);
		Kannada kannada = new Kannada("Krishnamurthy ",68900.355,num,values,kavya);
		
		science.displayScienceDeaties();
		System.out.println("------------------------------------------------------");
		maths.displayMathamaticsDeaties();
		System.out.println("------------------------------------------------------");
		kannada.displayKannadaDeaties();
	}
}