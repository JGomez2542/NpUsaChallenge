package com.example.admin.npusachallenge

import android.app.Application
import com.example.admin.npusachallenge.di.application.ApplicationComponent
import com.example.admin.npusachallenge.di.application.ApplicationModule
import com.example.admin.npusachallenge.di.application.DaggerApplicationComponent

class AppController : Application() {

    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}