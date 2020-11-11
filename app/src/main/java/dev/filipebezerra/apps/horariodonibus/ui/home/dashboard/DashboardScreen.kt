package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import dev.filipebezerra.apps.horariodonibus.databinding.DashboardScreenBinding

class DashboardScreen : Fragment() {

    private val dashboardViewModel: DashboardViewModel by viewModels()

    private lateinit var viewBinding: DashboardScreenBinding

    private lateinit var busStationAdapter: BusStationAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = DashboardScreenBinding.inflate(inflater)
        .apply {
            viewBinding = this
            viewModel = dashboardViewModel
        }
        .root

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewBinding.lifecycleOwner = viewLifecycleOwner
        createBusStationListAdapter()
    }

    private fun createBusStationListAdapter() {
        val linearLayoutManager = LinearLayoutManager(viewBinding.busStationList.context)
        val dividerItemDecoration = DividerItemDecoration(context, linearLayoutManager.orientation)

        with(viewBinding.busStationList) {
            layoutManager = linearLayoutManager
            addItemDecoration(dividerItemDecoration)
        }

        BusStationAdapter().also {
            viewBinding.busStationList.adapter = it
            busStationAdapter = it
        }
    }
}