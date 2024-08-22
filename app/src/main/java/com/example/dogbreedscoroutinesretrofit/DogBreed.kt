package com.example.dogbreedscoroutinesretrofit

import com.google.gson.annotations.SerializedName

data class DogBreed(
    @SerializedName("message")
    val message: Message,
    @SerializedName("status")
    val status: String = ""
)