package dev.filipebezerra.apps.horariodonibus.ui.stationbuslines

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.filipebezerra.apps.horariodonibus.data.BusLine
import dev.filipebezerra.apps.horariodonibus.databinding.StationBusLineItemBinding

class StationBusLineAdapter :
    ListAdapter<BusLine, StationBusLineViewHolder>(StationBusLineDiffItemCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        StationBusLineViewHolder.from(parent)

    override fun onBindViewHolder(holderBusLine: StationBusLineViewHolder, position: Int) =
        holderBusLine.bindTo(getItem(position))
}

class StationBusLineViewHolder private constructor(
    private val itemViewBinding: StationBusLineItemBinding
) : RecyclerView.ViewHolder(itemViewBinding.root) {

    fun bindTo(item: BusLine) {
        itemViewBinding.apply {
            busLine = item
            executePendingBindings()
        }
    }

    companion object {
        fun from(parent: ViewGroup): StationBusLineViewHolder {
            val itemViewBinding = StationBusLineItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return StationBusLineViewHolder(itemViewBinding)
        }
    }
}

class StationBusLineDiffItemCallback : DiffUtil.ItemCallback<BusLine>() {
    override fun areItemsTheSame(oldItem: BusLine, newItem: BusLine) =
        oldItem.lineNumber == newItem.lineNumber

    override fun areContentsTheSame(oldItem: BusLine, newItem: BusLine) =
        oldItem == newItem
}