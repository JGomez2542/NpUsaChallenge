package com.example.admin.npusachallenge.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast

abstract class BaseActivity<T : BasePresenter> : AppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun onStop() {
        super.onStop()
        getViewPresenter().onStop()
    }

    override fun showError(message: String) {
        showDialog(message, "Error")
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun showDialog(message: String, title: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Ok") { dialog, _ -> dialog?.cancel() }
            .show()
    }

    abstract fun getViewPresenter(): T
    abstract fun init()
}
