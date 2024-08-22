package com.example.dogbreedscoroutinesretrofit

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface MyAPI {

    @GET("breeds/list/all")
    suspend fun getBreeds(): Response<DogBreed>
}