package ru.geekbrains.androidkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import ru.geekbrains.androidkotlin.data.Repository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherRecycler = findViewById<RecyclerView>(R.id.recyclerWeather)
        val adapter = WeatherAdapter(Repository)
        weatherRecycler.adapter = adapter
    }
}