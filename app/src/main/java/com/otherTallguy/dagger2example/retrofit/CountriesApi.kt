package com.otherTallguy.dagger2example.retrofit


import com.otherTallguy.dagger2example.model.Country

import retrofit2.Response
import retrofit2.http.GET

interface CountriesApi {

    @GET("DevTides/countries/master/countriesV2.json")
    suspend fun getCountries(): Response<List<Country>> // we are using coroutines here so making the function suspend.
}