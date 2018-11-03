package com.example.admin.npusachallenge.ui.login

import com.example.admin.npusachallenge.base.BasePresenter
import com.example.admin.npusachallenge.base.BaseView

interface LoginContract {
    interface View : BaseView {
        fun enableLoginButton()
        fun disableLoginButton()
        fun showLoadingIndicator()
        fun hideLoadingIndicator()
        fun setLoginButtonColor(boolean: Boolean)
        fun startMainScreenActivity()
    }

    interface Presenter : BasePresenter {
        fun validateUser(email: String, password: String)
        fun setLoginButtonColor(email: String, password: String)
    }
}