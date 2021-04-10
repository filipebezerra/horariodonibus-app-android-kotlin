package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.filipebezerra.apps.horariodonibus.domain.models.BusLine

@BindingAdapter("busLineList")
fun bindBusLineList(recyclerView: RecyclerView, busLineList: List<BusLine>) =
    (recyclerView.adapter as BusLineAdapter).submitList(busLineList)