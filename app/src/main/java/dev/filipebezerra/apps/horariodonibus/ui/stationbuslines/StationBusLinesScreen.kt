package dev.filipebezerra.apps.horariodonibus.ui.stationbuslines

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import dev.filipebezerra.apps.horariodonibus.databinding.StationBusLinesScreenBinding
import dev.filipebezerra.apps.horariodonibus.ui.stationbuslines.StationBusLinesViewModel.Companion.provideFactory

class StationBusLinesScreen : Fragment() {

    private val arguments: StationBusLinesScreenArgs by navArgs()

    private val stationBusLinesViewModel: StationBusLinesViewModel by viewModels {
        provideFactory(arguments.stationNumber)
    }

    private lateinit var viewBinding: StationBusLinesScreenBinding

    private lateinit var stationBusLineAdapter: StationBusLineAdapter

    private val navController: NavController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = StationBusLinesScreenBinding.inflate(inflater)
        .apply {
            viewBinding = this
            viewModel = stationBusLinesViewModel
            lifecycleOwner = viewLifecycleOwner
            createStationBusLineListAdapter()
            setupToolbar()
            subscribeUi()
        }
        .root

    private fun setupToolbar() {
        viewBinding.toolbar.setNavigationOnClickListener { navController.navigateUp() }
        viewBinding.toolbar.title = arguments.stationNumber
    }

    private fun createStationBusLineListAdapter() {
        val linearLayoutManager = LinearLayoutManager(viewBinding.stationBusLineList.context)
        val dividerItemDecoration = DividerItemDecoration(context, linearLayoutManager.orientation)

        with(viewBinding.stationBusLineList) {
            layoutManager = linearLayoutManager
            addItemDecoration(dividerItemDecoration)
        }

        StationBusLineAdapter().also {
            viewBinding.stationBusLineList.adapter = it
            stationBusLineAdapter = it
        }
    }

    private fun subscribeUi() {
        stationBusLinesViewModel.busStation.observe(viewLifecycleOwner) {
            viewBinding.toolbar.subtitle = it.address
        }
    }
}