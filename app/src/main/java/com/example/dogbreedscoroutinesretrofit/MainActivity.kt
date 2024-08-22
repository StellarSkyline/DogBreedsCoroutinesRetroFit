package com.example.dogbreedscoroutinesretrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dogbreedscoroutinesretrofit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var vm: MainActivityViewModel
    lateinit var vb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)
        vm = ViewModelProvider(this)[MainActivityViewModel::class.java]

        vm.getPoodle()
        vm.poodle.observe(this) {
            for(i in it) {
               vb.tvText.text = "${vb.tvText.text}, $i"
            }
        }
    }
}