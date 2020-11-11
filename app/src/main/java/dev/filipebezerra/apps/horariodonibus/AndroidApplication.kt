package dev.filipebezerra.apps.horariodonibus

import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid

class AndroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this)
    }
}