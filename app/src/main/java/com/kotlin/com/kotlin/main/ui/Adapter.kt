package com.kotlin.com.kotlin.main.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.com.kotlin.R
import com.kotlin.com.kotlin.weather.Weather
import com.kotlin.com.kotlin.weather.WeatherDetail
import kotlinx.android.synthetic.main.item_weather.view.*

/**
 * Created by root on 16-4-26.
 */
class Adapter(val weather: Weather, val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {
	override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
		holder?.bindWeather(weather.result.get(position))
	}

	override fun getItemCount(): Int = weather.result.size


	override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
		return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_weather, parent, false))
	}


	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

		fun bindWeather(detail: WeatherDetail) {
			itemView.date.text = detail.days
			itemView.description.text = detail.weather
			itemView.maxTemperature.text = "${detail.temp_high}º"
			itemView.minTemperature.text = "${detail.temp_low}º"
			itemView.setOnClickListener({
				view ->
				Log.i("hehe", getLayoutPosition().toString());
			})
		}
	}
}