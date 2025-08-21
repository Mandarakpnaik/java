class BangaloreRunner
{
    public static void main(String[] args)
    {
        String[] places = {"Lalbagh", "Cubbon Park", "Vidhana Soudha", "MG Road"};
		
        String[] bangalorePlace = Bangalore.famousPlaces(places);
		
        for(int name = 0; name < places.length; name++)
        {
            System.out.println(places[name]);
        }

        int[] populations = {1000000, 2000000, 1500000, 1800000};
		
        int[] bangalorePopulation = Bangalore.populations(populations);
		
        for(int number = 0; number< populations.length; number++)
        {
            System.out.println(populations[number]);
        }

        long[] pinCodes = {560001L, 560002L, 560003L, 560004L};
		
        long[] bangalorePins = Bangalore.pinCodes(pinCodes);
		
        for(int pin = 0; pin< pinCodes.length; pin++)
        {
            System.out.println(pinCodes[pin]);
        }

        double[] temperatures = {27.555, 28.099, 26.887, 25.997};
		
        double[] bangaloreTemperature = Bangalore.temperatures(temperatures);
		
        for(int weather = 0; weather< temperatures.length; weather++)
        {
            System.out.println(temperatures[weather]);
        }

        float[] areas = {741.0f, 800.5f, 650.3f, 720.4f};
		
        float[] bangaloreAreas = Bangalore.areas(areas);
		
        for(int kms = 0; kms< areas.length; kms++)
        {
            System.out.println(areas[kms]);
        }

        char[] zone = {'A', 'B', 'C', 'D'};
		
        char[] bangaloreZones = Bangalore.zones(zone);
		
        for(int type = 0; type< zone.length; type++)
			
        {
            System.out.println(zone[type]);
        }

        boolean[] metros = {true, true, true, true};
		
        boolean[] bangaloreMetro = Bangalore.isMetro(metros);
		
        for(int area = 0; area<metros.length; area++)
        {
            System.out.println(metros[area]);
        }
    }
}