package com.example.admin.npusachallenge.di.activity

import com.example.admin.npusachallenge.ui.MainScreen.MainScreenActivity
import com.example.admin.npusachallenge.ui.login.LoginActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ContractModule::class])
interface ActivityComponent {

    fun inject(loginActivity: LoginActivity)

    fun inject(mainScreenActivity: MainScreenActivity)
}