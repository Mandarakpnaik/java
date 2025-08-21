class WaterBottelRunner
{
	public static void main(String [] ref)
	{
		String[] brand = {"Milton", "Cello", "Tupperware", "Nike"};
        String[] names = WaterBottel.brands(brand);
		
        for(int name=0; name<brand.length; name++)
        {
            System.out.println(brand[name]);
        }

        int[] capacitie = {500, 750, 1000, 1500};
        int[] bottle = WaterBottel.capacities(capacitie);
		
        for(int value=0; value<capacitie.length;value++)
        {
            System.out.println(capacitie[value]);
        }

        long[] barCode = {13487253734L, 22334357022L, 33333324244L, 4987654567876L};
        long[] codes = WaterBottel.barCodes(barCode);
        for(int number = 0; number< barCode.length; number++)
        {
            System.out.println(barCode[number]);
        }
		double[] prices = {249.99, 349.50, 499.75, 699.00};
        double[] price = WaterBottel.prices(prices);
		
        for(int amount= 0; amount<prices.length;amount++)
        {
            System.out.println(prices[amount]);
        }

        float[] weight = {0.25f, 0.35f, 0.50f, 0.65f};
        float[] weights = WaterBottel.weights(weight);
		
        for(int num = 0; num<weight.length; num++)
        {
            System.out.println(weights[num] );
		}
		char[] grades = {'A', 'B', 'A', 'C'};
        char[] charater = WaterBottel.qualityGrades(grades);
		
        for(int word= 0; word<grades.length; word++)
        {
            System.out.println(grades[word]);
        }

        boolean[] steel = {true, false, true, true};
        boolean[] steels = WaterBottel.isSteel(steel);
		
        for(int words=0;words<steel.length; words++)
        {
            System.out.println(steel[words]);
        }
	}
}