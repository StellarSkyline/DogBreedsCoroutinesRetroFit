package com.example.dogbreedscoroutinesretrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel:ViewModel() {
    private val repo = MainActivityRepo()
    val poodle = MutableLiveData<List<String>>()

    fun getPoodle() {
        viewModelScope.launch {
            val response = repo.getPoodle()

            if(response.isSuccessful) {
                poodle.value = response.body()!!.message.poodle!!
            }


        }
    }


}