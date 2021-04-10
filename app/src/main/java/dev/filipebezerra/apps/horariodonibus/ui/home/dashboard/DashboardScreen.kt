package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import dev.filipebezerra.apps.horariodonibus.ServiceLocator
import dev.filipebezerra.apps.horariodonibus.databinding.DashboardScreenBinding
import dev.filipebezerra.apps.horariodonibus.ui.base.FragmentBase

class DashboardScreen : FragmentBase() {

    override val _viewModel: DashboardViewModel by viewModels {
        DashboardViewModel.createViewModelFactory(ServiceLocator.provideBusStationService())
    }

    private lateinit var viewBinding: DashboardScreenBinding

    private lateinit var busLineAdapter: BusLineAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = DashboardScreenBinding.inflate(inflater)
        .apply {
            viewBinding = this
            viewModel = _viewModel
            lifecycleOwner = viewLifecycleOwner
            createBusLineListAdapter()
        }
        .root

    private fun createBusLineListAdapter() {
        val linearLayoutManager = LinearLayoutManager(viewBinding.busStationList.context)
        val dividerItemDecoration = DividerItemDecoration(context, linearLayoutManager.orientation)

        with(viewBinding.busStationList) {
            layoutManager = linearLayoutManager
            addItemDecoration(dividerItemDecoration)
        }

        BusLineAdapter().also {
            viewBinding.busStationList.adapter = it
            busLineAdapter = it
        }
    }
}