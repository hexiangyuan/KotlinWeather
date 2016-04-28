package com.kotlin.com.kotlin.main.persenter

import com.kotlin.com.kotlin.main.model.WeatherImpl
import com.kotlin.com.kotlin.main.model.WeatherModel
import com.kotlin.com.kotlin.main.view.IView
import com.kotlin.com.kotlin.weather.Weather

/**
 * Created by root on 16-4-26.
 */
 class PersenterImpl(private val view: IView) : IPresenter{
	val model:WeatherModel
	init{
		model = WeatherImpl()
	}

	override fun loadWeather() {
		model.downloadJson(object:WeatherModel.Listener{
			override fun onSuccess(weather: Weather) {
				view.weatherLoaded(weather)
			}

			override fun onFail() {
			}

		})
	}

	override fun toWeatherDetail() {
//		view.toWeatherDetail()
	}

}