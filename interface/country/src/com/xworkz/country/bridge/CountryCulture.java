package com.xworkz.country.bridge;

import com.xworkz.country.internal.*;

public interface CountryCulture {
    float cities(CountryCities countryCities);
    CountryDetails details(CountryDetails countryDetails);
    boolean info(CountryInfo countryInfo);
    CountryStates states(CountryStates countryStates);
    boolean tourism(CountryTourism countryTourism);

}
