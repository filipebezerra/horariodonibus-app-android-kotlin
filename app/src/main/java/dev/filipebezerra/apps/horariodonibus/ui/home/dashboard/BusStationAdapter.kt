package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.filipebezerra.apps.horariodonibus.data.BusStation
import dev.filipebezerra.apps.horariodonibus.databinding.BusStationItemBinding

class BusStationAdapter : ListAdapter<BusStation, BusStopViewHolder>(BusStopDiffItemCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BusStopViewHolder.from(parent)

    override fun onBindViewHolder(holder: BusStopViewHolder, position: Int) =
        holder.bindTo(getItem(position))
}

class BusStopViewHolder private constructor(
    private val itemViewBinding: BusStationItemBinding
) : RecyclerView.ViewHolder(itemViewBinding.root) {

    fun bindTo(busStation: BusStation) = with(busStation) {
        itemViewBinding.busStation = busStation
        itemViewBinding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): BusStopViewHolder {
            val itemViewBinding = BusStationItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return BusStopViewHolder(itemViewBinding)
        }
    }
}

class BusStopDiffItemCallback : DiffUtil.ItemCallback<BusStation>() {
    override fun areItemsTheSame(oldItem: BusStation, newItem: BusStation) =
        oldItem.lineNumber == newItem.lineNumber

    override fun areContentsTheSame(oldItem: BusStation, newItem: BusStation) =
        oldItem == newItem
}