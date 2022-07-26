package com.example.myshoestore

import android.app.Application
import timber.log.Timber

class PusherApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

    }
}

//just play with constraints and chains....ab baseline green box to align(baseline align
//columns and rows can be achieved by aligning with constraints and chains