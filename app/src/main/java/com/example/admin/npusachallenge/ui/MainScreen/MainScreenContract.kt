package com.example.admin.npusachallenge.ui.MainScreen

import android.view.MotionEvent
import com.example.admin.npusachallenge.base.BasePresenter
import com.example.admin.npusachallenge.base.BaseView

interface MainScreenContract {
    interface View : BaseView {
        fun setRotationAnimation(fromDegrees: Float, toDegrees: Float)
    }

    interface Presenter : BasePresenter {
        fun changeCircleRevolution(motionEvent: MotionEvent): Boolean
    }
}