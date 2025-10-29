package com.xworkz.country.external;

import com.xworkz.country.bridge.*;
import com.xworkz.country.internal.*;

public class CountryRunner {
    public static void main(String[] args) {
        Country country = new CountryImpli();
        CountryCities countryCities = new CountryCities(2500,27.4f);
        country.cities(countryCities);
        CountryDetails countryDetails = new CountryDetails("India",1345678433);
        country.details(countryDetails);
        CountryInfo countryInfo= new CountryInfo("India",false);
        country.info(countryInfo);
        CountryStates countryStates= new CountryStates(28,"karnataka");
        country.states(countryStates);
        CountryTourism countryTourism= new CountryTourism(67989,150);
        country.tourism(countryTourism);
        System.out.println("-------------------------------------------------------");


        CountryCulture countryCulture= new CountryCultureImpli();
        CountryCities countryCity = new CountryCities(25006,19.4f);
        countryCulture.cities(countryCity);
        CountryDetails countryDetail = new CountryDetails("China",9098433);
        countryCulture.details(countryDetail);
        CountryInfo countryInf= new CountryInfo("China",true);
        countryCulture.info(countryInf);
        CountryStates countryState= new CountryStates(34,"Hubei");
        countryCulture.states(countryState);
        CountryTourism countrytourism= new CountryTourism(22450,500);
        countryCulture.tourism(countrytourism);
        System.out.println("-------------------------------------------------------");


        CountryEconomy countryEconomy =new CountryEconomyImpli();
        CountryCities cities = new CountryCities(2500,30.56f);
        countryEconomy.cities(cities);
        CountryDetails details = new CountryDetails("India",67878433);
        countryEconomy.details(details);
        CountryInfo info= new CountryInfo("India",false);
        countryEconomy.info(info);
        CountryStates States= new CountryStates(28,"tamil nadu");
        countryEconomy.states(States);
        CountryTourism tourism= new CountryTourism(87989,250);
        countryEconomy.tourism(tourism);
        System.out.println("-------------------------------------------------------");


        CountryName countryName=new CountryNameImpli();
        CountryCities name = new CountryCities(20,10.56f);
        countryEconomy.cities(name);
        CountryDetails names = new CountryDetails("Malaysia",67878433);
        countryEconomy.details(names);
        CountryInfo infoValue= new CountryInfo("malaysis",false);
        countryEconomy.info(infoValue);
        CountryStates statesNumber= new CountryStates(13,"Perak");
        countryEconomy.states(statesNumber);
        CountryTourism tourismName= new CountryTourism(67899,45000);
        countryEconomy.tourism(tourismName);
        System.out.println("-------------------------------------------------------");

        CountryPopulation countryPopulation=new CountryPopulationImpli();
        CountryCities value = new CountryCities(20,24.0f);
        countryPopulation.cities(value);
        CountryDetails values = new CountryDetails("Cuba",100000000);
        countryPopulation.details(values);
        CountryInfo infoValues= new CountryInfo("Cuba",false);
        countryPopulation.info(infoValues);
        CountryStates statesNumbers= new CountryStates(15,"Villa clara");
        countryPopulation.states(statesNumbers);
        CountryTourism tourismNames= new CountryTourism(1000,5000);
        countryPopulation.tourism(tourismNames);
    }
}
