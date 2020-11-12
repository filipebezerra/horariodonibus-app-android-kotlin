package dev.filipebezerra.apps.horariodonibus.ui.nearbystations

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
import dev.filipebezerra.apps.horariodonibus.databinding.NearbyStationsScreenScreenBinding

class NearbyStationsScreen : Fragment() {

    private val screenViewModel: NearbyStationsScreenViewModel by viewModels()

    private lateinit var viewBinding: NearbyStationsScreenScreenBinding

    private lateinit var busStationAdapter: BusStationAdapter

    private val navController: NavController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = NearbyStationsScreenScreenBinding.inflate(inflater)
        .apply {
            viewBinding = this
            viewModel = screenViewModel
            viewBinding.lifecycleOwner = viewLifecycleOwner
            createBusStationListAdapter()
            setupToolbar()
        }
        .root

    private fun setupToolbar() {
        viewBinding.toolbar.setNavigationOnClickListener { navController.navigateUp() }
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