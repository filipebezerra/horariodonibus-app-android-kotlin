package dev.filipebezerra.apps.horariodonibus.ui.bustrip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import dev.filipebezerra.apps.horariodonibus.databinding.BusTripScreenBinding
import dev.filipebezerra.apps.horariodonibus.ui.bustrip.BusTripViewModel.Companion.provideFactory

class BusTripScreen : Fragment() {

    private val arguments: BusTripScreenArgs by navArgs()

    private val busTripViewModel: BusTripViewModel by viewModels {
        provideFactory(arguments.stationNumber, arguments.selectedLineNumber)
    }

    private lateinit var viewBinding: BusTripScreenBinding

    private val navController: NavController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = BusTripScreenBinding.inflate(inflater)
        .apply {
            viewBinding = this
            viewModel = busTripViewModel
            lifecycleOwner = viewLifecycleOwner
            setupToolbar()
            subscribeUi()
        }
        .root


    private fun setupToolbar() {
        viewBinding.toolbar.setNavigationOnClickListener { navController.navigateUp() }
        viewBinding.toolbar.title = arguments.stationNumber
    }

    private fun subscribeUi() {
        busTripViewModel.busStation.observe(viewLifecycleOwner) {
            viewBinding.toolbar.subtitle = it.address
        }
    }
}