package com.kotlin.com.kotlin.weather

import java.util.*

/**
 * Created by root on 16-4-26.
 */
data class WeatherDetail(
		val weaid: String,
		val days: String,
		val week: String,
		val cityno: String,
		val citynm: String,
		val cityid: String,
		val temperature: String,
		val humidity: String,
		val weather: String,
		val weather_icon: String,
		val weather_icon1: String,
		val wind: String,
		val winp: String,
		val temp_high: String,
		val temp_low: String,
		val humi_high: String,
		val humi_low: String,
		val weatid: String,
		val weatid1: String,
		val windid: String,
		val winpid: String)

data class Weather(
		val success: String,
		val result: ArrayList<WeatherDetail>)
