package com.lavrent.flightsearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lavrent.flightsearch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

    }
}