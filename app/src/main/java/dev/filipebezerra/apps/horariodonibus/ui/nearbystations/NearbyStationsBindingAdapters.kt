package dev.filipebezerra.apps.horariodonibus.ui.nearbystations

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.filipebezerra.apps.horariodonibus.data.BusStation

@BindingAdapter("busStationList")
fun bindBusStationList(recyclerView: RecyclerView, busStationList: List<BusStation>) =
    (recyclerView.adapter as BusStationAdapter).submitList(busStationList)

@BindingAdapter("distanceTo")
fun bindDistanceTo(textView: TextView, busStation: BusStation) {
    textView.text = "${busStation.stationNumber}m"
}