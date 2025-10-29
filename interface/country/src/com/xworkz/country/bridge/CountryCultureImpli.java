package com.xworkz.country.bridge;

import com.xworkz.country.internal.*;

public class CountryCultureImpli implements CountryCulture{
    public float cities(CountryCities countryCities) {
        if (countryCities.temp == 40.4f) {
            System.out.println("Country temp " + countryCities.temp + "," + "Country number of cities " + countryCities.numberOfCities);

        } else {

            countryCities.temp = 30.56f;
            System.out.println("Country temp " + countryCities.temp + "," + "Country number of cities " + countryCities.numberOfCities);
        }
        return countryCities.temp;
    }

    @Override
    public CountryDetails details(CountryDetails countryDetails) {
        System.out.println("Country name" + countryDetails.name + "," + "country population :" + countryDetails.population);
        return countryDetails;
    }

    @Override
    public boolean info(CountryInfo countryInfo) {
        if (countryInfo.isDeveloped) {
            System.out.println("country name :" + countryInfo.name + "," + "country is developed :" + countryInfo.isDeveloped);
            return true;
        } else {
            System.out.println("country name :" + countryInfo.name + "," + "country is developed :" + countryInfo.isDeveloped);
            return false;
        }
    }


    @Override
    public CountryStates states(CountryStates countryStates) {
        System.out.println("Country states name :" + countryStates.stateName + "," + "Number states in country" + countryStates.noOfStates);
        return countryStates;
    }

    @Override
    public boolean tourism(CountryTourism countryTourism) {
        if (countryTourism.touristPrice >= 250) {
            System.out.println("tourist price :" + countryTourism.touristPrice + "," + "number of tourist :" + countryTourism.noOfTourist);

            return true;
        } else {
            System.out.println("tourist price :" + countryTourism.touristPrice + "," + "number of tourist :" + countryTourism.noOfTourist);
            return false;
        }

    }
}
