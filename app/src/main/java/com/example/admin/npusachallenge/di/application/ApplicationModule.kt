package com.example.admin.npusachallenge.di.application

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(val application: Context) {

    @Provides
    @ApplicationScope
    fun providesContext(): Context = application
}