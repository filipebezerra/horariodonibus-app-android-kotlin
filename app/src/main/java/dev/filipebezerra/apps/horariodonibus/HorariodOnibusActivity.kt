package dev.filipebezerra.apps.horariodonibus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dev.filipebezerra.apps.horariodonibus.databinding.HorarioDonibusActivityBinding

class HorariodOnibusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<HorarioDonibusActivityBinding>(
            this,
            R.layout.horario_donibus_activity
        )
    }
}