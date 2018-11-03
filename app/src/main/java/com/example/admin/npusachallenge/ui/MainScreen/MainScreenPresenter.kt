package com.example.admin.npusachallenge.ui.MainScreen

import android.view.MotionEvent

/**
 * Presenter for the MainScreenActivity. This presenter decides the rotation direction for the
 * image circle.
 */

class MainScreenPresenter(private val mainScreenActivity: MainScreenContract.View) : MainScreenContract.Presenter {

    var downXValue = 0f

    override fun changeCircleRevolution(motionEvent: MotionEvent): Boolean {
        return when (motionEvent.action) {
            MotionEvent.ACTION_DOWN -> {
                downXValue = motionEvent.x
                true
            }
            MotionEvent.ACTION_UP -> {
                val currentXValue = motionEvent.x
                if (currentXValue < downXValue) mainScreenActivity.setRotationAnimation(360f, 0f)
                else mainScreenActivity.setRotationAnimation(0f, 360f)
                true
            }
            else -> false
        }
    }

    override fun onStop() {
        //TODO implement any onStop operations for this presenter here
    }
}