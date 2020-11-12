package dev.filipebezerra.apps.horariodonibus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import dev.filipebezerra.apps.horariodonibus.databinding.MainActivityBinding

class HorarioDOnibusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView<MainActivityBinding>(this, R.layout.main_activity)
    }
}