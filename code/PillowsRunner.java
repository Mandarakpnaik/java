class PillowsRunner
{
	public static void main(String[] ref)
	{
		String[] brands = {"Sleepwell", "Kurlon", "Recron", "Coirfit"};
        String[] pillowBrands = Pillows.pillowBrands(brands);
        for(int pillows = 0; pillows < brands.length; pillows++)
        {
            System.out.println(brands[pillows]);
        }

        int[] sizes = {40, 50, 60, 70};
        int[] pillowSizes = Pillows.sizes(sizes);
        for(int size = 0; size< sizes.length; size++)
        {
            System.out.println(sizes[size]);
        }

        long[] barcodes = {1111111111L, 2222222222L, 3333333333L, 4444444444L};
        long[] pillowCodes = Pillows.barcodes(barcodes);
        for(int number = 0; number< barcodes.length; number++)
        {
            System.out.println(barcodes[number]);
		}
		double[] prices = {499.99, 699.50, 899.00, 1200.75};
        double[] pillowPrices = Pillows.prices(prices);
        for(int i = 0; i < prices.length; i++)
        {
            System.out.println(prices[i]);
        }

        float[] weights = {0.5f, 0.7f, 0.9f, 1.2f};
        float[] pillowWeights = Pillows.weights(weights);
        for(int value = 0; value < weights.length; value++)
        {
            System.out.println(weights[value]);
        }
		 char[] grades = {'A', 'B', 'A', 'C'};
        char[] pillowGrades = Pillows.pillowGrades(grades);
        for(int charater = 0; charater< grades.length; charater++)
        {
            System.out.println(grades[charater]);
        }
        boolean[] soft = {true, true, false, true};
        boolean[] pillowSoftness = Pillows.isSoft(soft);
        for(int words = 0; words < soft.length; words++)
        {
            System.out.println(soft[words]);
		}
	}
}