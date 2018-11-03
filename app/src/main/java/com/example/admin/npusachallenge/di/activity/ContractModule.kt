package com.example.admin.npusachallenge.di.activity

import android.app.Activity
import android.databinding.DataBindingUtil
import com.example.admin.npusachallenge.R
import com.example.admin.npusachallenge.base.BaseActivity
import com.example.admin.npusachallenge.databinding.ActivityLoginBinding
import com.example.admin.npusachallenge.databinding.ActivityMainBinding
import com.example.admin.npusachallenge.ui.MainScreen.MainScreenContract
import com.example.admin.npusachallenge.ui.MainScreen.MainScreenPresenter
import com.example.admin.npusachallenge.ui.login.LoginContract
import com.example.admin.npusachallenge.ui.login.LoginPresenter
import dagger.Module
import dagger.Provides

@Module
class ContractModule(private val baseActivity: BaseActivity<*>) {

    @Provides
    @ActivityScope
    fun providesLoginContractPresenter(): LoginContract.Presenter = LoginPresenter(baseActivity as LoginContract.View)

    @Provides
    @ActivityScope
    fun providesLoginActivityBinding(): ActivityLoginBinding =
        DataBindingUtil.setContentView(baseActivity as Activity, R.layout.activity_login)

    @Provides
    @ActivityScope
    fun providesMainScreenPresenter(): MainScreenContract.Presenter =
        MainScreenPresenter(baseActivity as MainScreenContract.View)

    @Provides
    @ActivityScope
    fun providesMainScreenActivityBinding(): ActivityMainBinding =
        DataBindingUtil.setContentView(baseActivity as Activity, R.layout.activity_main)
}