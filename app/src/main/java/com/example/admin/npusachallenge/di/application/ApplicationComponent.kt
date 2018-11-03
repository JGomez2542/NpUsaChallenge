package com.example.admin.npusachallenge.di.application

import com.example.admin.npusachallenge.di.activity.ActivityComponent
import com.example.admin.npusachallenge.di.activity.LoginContractModule
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun newActivityComponent(
        loginContractModule: LoginContractModule
    ): ActivityComponent
}