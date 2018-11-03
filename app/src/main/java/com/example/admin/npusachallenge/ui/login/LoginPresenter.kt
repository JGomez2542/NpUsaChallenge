package com.example.admin.npusachallenge.ui.login

import android.app.Activity

class LoginPresenter(private val loginView: LoginContract.View) : LoginContract.Presenter {

    lateinit var thread: Thread

    override fun onStop() {
        thread.interrupt()
    }

    override fun setLoginButtonColor(email: String, password: String) {
        loginView.setLoginButtonColor(email.isNotBlank() && password.isNotBlank())
    }

    override fun validateUser(email: String, password: String) {
        loginView.showLoadingIndicator()
        loginView.disableLoginButton()
        thread = Thread(Runnable {
            try {
                Thread.sleep(3000)
                (loginView as Activity).runOnUiThread {
                    if (email == "gomezja@plu.edu" && password == "jason") {
                        loginView.showMessage("Login Successful")
                        loginView.startMainScreenActivity()
                    } else {
                        loginView.showError("Wrong username or password")
                    }
                    loginView.hideLoadingIndicator()
                    loginView.enableLoginButton()
                }
            } catch (e: InterruptedException) {
                return@Runnable
            }
        })
        thread.start()
    }
}