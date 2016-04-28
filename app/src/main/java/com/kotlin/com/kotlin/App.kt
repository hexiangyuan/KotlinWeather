package com.kotlin.com.kotlin

import android.app.Application
import android.content.Context

/**
 * Created by root on 16-4-26.
 */
class App :Application(){
	var instance : Context = null!!;
	companion object{
	}

	override fun onCreate() {
		super.onCreate()
	}
}