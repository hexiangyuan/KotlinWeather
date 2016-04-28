package com.kotlin.com.kotlin.main.view

import com.kotlin.com.kotlin.weather.Weather
import com.kotlin.com.kotlin.weather.WeatherDetail

/**
 * Created by root on 16-4-26.
 */
 interface IView {
	fun weatherLoaded(weather: Weather)
	fun toWeatherDetail(wetherDetail: WeatherDetail)
}
