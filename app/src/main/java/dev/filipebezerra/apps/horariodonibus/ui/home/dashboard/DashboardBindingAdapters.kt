package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.filipebezerra.apps.horariodonibus.data.BusStation

@BindingAdapter("list")
fun bindList(recyclerView: RecyclerView, busLineList: List<BusStation>) =
    (recyclerView.adapter as BusStationAdapter).submitList(busLineList)