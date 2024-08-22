package com.example.dogbreedscoroutinesretrofit

import retrofit2.http.GET

interface MyAPI {

    @GET("breeds/list/all")
    suspend fun getBreeds(): DogBreed
}