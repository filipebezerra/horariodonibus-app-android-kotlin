package dev.filipebezerra.apps.horariodonibus.ui.nearbystations

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.filipebezerra.apps.horariodonibus.data.BusStation
import dev.filipebezerra.apps.horariodonibus.databinding.NearbyBusStationItemBinding

class BusStationAdapter :
    ListAdapter<BusStation, BusStationViewHolder>(BusStationDiffItemCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BusStationViewHolder.from(parent)

    override fun onBindViewHolder(holder: BusStationViewHolder, position: Int) =
        holder.bindTo(getItem(position))
}

class BusStationViewHolder private constructor(
    private val itemViewBinding: NearbyBusStationItemBinding
) : RecyclerView.ViewHolder(itemViewBinding.root) {

    fun bindTo(item: BusStation) {
        itemViewBinding.apply {
            busStation = item
            executePendingBindings()
        }
    }

    companion object {
        fun from(parent: ViewGroup): BusStationViewHolder {
            val itemViewBinding = NearbyBusStationItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return BusStationViewHolder(itemViewBinding)
        }
    }
}

class BusStationDiffItemCallback : DiffUtil.ItemCallback<BusStation>() {
    override fun areItemsTheSame(oldItem: BusStation, newItem: BusStation) =
        oldItem.stationNumber == newItem.stationNumber

    override fun areContentsTheSame(oldItem: BusStation, newItem: BusStation) =
        oldItem == newItem
}