package ru.geekbrains.androidkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.geekbrains.androidkotlin.data.IRepository
import ru.geekbrains.androidkotlin.data.Weather

class WeatherAdapter (private val repository: IRepository): RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> (){
    class WeatherViewHolder(val item: View): RecyclerView.ViewHolder(item){
        private val city : TextView = item.findViewById(R.id.textCity)
        private val temperature : TextView = item.findViewById(R.id.textTemperature)
        fun bind(weather: Weather){
            city.text = weather.town
            temperature.text = weather.temperature.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return WeatherViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.bind(repository.getWeathers()[position])
    }

    override fun getItemCount(): Int {
       return repository.getWeathers().size
    }
}

