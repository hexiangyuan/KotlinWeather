package com.kotlin.com.kotlin.main.model

import android.util.Log
import com.google.gson.Gson
import com.kotlin.com.kotlin.weather.Weather
import org.jetbrains.anko.async
import java.net.URL

/**
 * Created by root on 16-4-26.
 */
class WeatherImpl : WeatherModel {
	companion object {
		private val APP_KEY = "15603"
		private val SIGN = "1164e338ac2a311c47b9f2eeb0bb3556"
		private val COMPLETE_URL = "http://api.k780.com:88/?app=weather.future&weaid=1&&appkey=${APP_KEY}&sign=${SIGN}&format=json"
		private var gson = Gson();
	}

	override fun downloadJson(listener: WeatherModel.Listener) {
		val weather: String
		async() {
			weather = request()
			Log.i("weather", weather)
			if (weather.length == 0) {
				listener.onFail()
			} else {
				val weatherObj: Weather = gson.fromJson(weather, Weather::class.java)
				listener.onSuccess(weatherObj)
			}
		}
	}

	fun request(): String = URL(COMPLETE_URL).readText()
}
