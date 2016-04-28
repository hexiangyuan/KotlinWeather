package com.kotlin.com.kotlin.main.model

import com.kotlin.com.kotlin.weather.Weather

/**
 * Created by root on 16-4-26.
 */
interface WeatherModel {
	fun downloadJson(listener : Listener)

	interface Listener{
		fun onSuccess(weather:Weather);
		fun onFail();
	}

}