package dev.filipebezerra.apps.horariodonibus

import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid
import timber.log.Timber

class HorariodOnibusApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this)
        BuildConfig.DEBUG.takeIf { it }?.let { Timber.plant(Timber.DebugTree()) }
    }
}