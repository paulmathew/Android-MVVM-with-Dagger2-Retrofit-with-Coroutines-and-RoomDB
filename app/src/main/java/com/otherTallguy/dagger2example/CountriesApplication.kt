package com.otherTallguy.dagger2example

import android.app.Application
import com.otherTallguy.dagger2example.di.ApplicationComponent
import com.otherTallguy.dagger2example.di.DaggerApplicationComponent


class CountriesApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}