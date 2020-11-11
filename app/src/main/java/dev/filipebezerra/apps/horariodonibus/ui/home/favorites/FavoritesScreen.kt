package dev.filipebezerra.apps.horariodonibus.ui.home.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.filipebezerra.apps.horariodonibus.databinding.FavoritesScreenBinding

class FavoritesScreen : Fragment() {

    private lateinit var viewBinding: FavoritesScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FavoritesScreenBinding.inflate(inflater)
        .apply {
            viewBinding = this
        }
        .root
}