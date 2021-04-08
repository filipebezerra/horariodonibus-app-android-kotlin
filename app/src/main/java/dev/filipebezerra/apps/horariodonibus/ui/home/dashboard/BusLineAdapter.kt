package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.filipebezerra.apps.horariodonibus.data.BusLine
import dev.filipebezerra.apps.horariodonibus.databinding.BusLineItemBinding

class BusLineAdapter : ListAdapter<BusLine, BusLineViewHolder>(BusLineDiffItemCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BusLineViewHolder.from(parent)

    override fun onBindViewHolder(holder: BusLineViewHolder, position: Int) =
        holder.bindTo(getItem(position))
}

class BusLineViewHolder private constructor(
    private val itemViewBinding: BusLineItemBinding
) : RecyclerView.ViewHolder(itemViewBinding.root) {

    fun bindTo(item: BusLine) {
        itemViewBinding.apply {
            busLine = item
            executePendingBindings()
        }
    }

    companion object {
        fun from(parent: ViewGroup): BusLineViewHolder {
            val itemViewBinding = BusLineItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            return BusLineViewHolder(itemViewBinding)
        }
    }
}

object BusLineDiffItemCallback : DiffUtil.ItemCallback<BusLine>() {
    override fun areItemsTheSame(oldItem: BusLine, newItem: BusLine) =
        oldItem.lineNumber == newItem.lineNumber

    override fun areContentsTheSame(oldItem: BusLine, newItem: BusLine) =
        oldItem == newItem
}