package com.example.dogbreedscoroutinesretrofit

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivityRepo {

    private val baseUrl = "https://dog.ceo/api/"

    private val api = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()
        .create(MyAPI::class.java)

    suspend fun getPoodle() = api.getBreeds().message.poodle


}







