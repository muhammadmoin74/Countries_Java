package com.example.countriesjava.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CountryAPI {

    @GET("devtides/countries/master/countriesV2.json")
     Single<List<CountryPojo>> getCountries();

    @GET("devtides/countries/master/countriesV2.json")
    Single<List<CountryPojo>> getCountries2();

}
