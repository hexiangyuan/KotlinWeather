package com.kotlin.com.kotlin.main.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import com.kotlin.com.kotlin.R
import com.kotlin.com.kotlin.main.persenter.IPresenter
import com.kotlin.com.kotlin.main.persenter.PersenterImpl
import com.kotlin.com.kotlin.main.view.IView
import com.kotlin.com.kotlin.weather.Weather
import com.kotlin.com.kotlin.weather.WeatherDetail
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IView {
	private val presenter: IPresenter

	init {
		presenter = PersenterImpl(this)
	}

	override fun weatherLoaded(weather: Weather) {
		recycler_view.adapter = Adapter(weather, this)
	}

	override fun toWeatherDetail(wetherDetail: WeatherDetail) {
		throw UnsupportedOperationException()
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		recycler_view.layoutManager = LinearLayoutManager(this)
		presenter.loadWeather()
	}

	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		return super.onCreateOptionsMenu(menu)
	}

}
