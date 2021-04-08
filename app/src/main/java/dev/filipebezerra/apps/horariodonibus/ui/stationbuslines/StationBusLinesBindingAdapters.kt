package dev.filipebezerra.apps.horariodonibus.ui.stationbuslines

import android.graphics.Typeface
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.amulyakhare.textdrawable.TextDrawable
import dev.filipebezerra.apps.horariodonibus.R
import dev.filipebezerra.apps.horariodonibus.data.BusLine
import dev.filipebezerra.apps.horariodonibus.ui.utils.ext.px

@BindingAdapter("stationBusLineList")
fun bindStationBusLineList(recyclerView: RecyclerView, busLineList: List<BusLine>) =
    (recyclerView.adapter as StationBusLineAdapter).submitList(busLineList)

@BindingAdapter("textDrawable")
fun bindTextDrawable(imageView: ImageView, lineNumber: String) {
    imageView.background = TextDrawable.builder()
        .beginConfig()
        .textColor(ContextCompat.getColor(imageView.context, R.color.red_700))
        .useFont(Typeface.create("raleway", Typeface.NORMAL))
        .fontSize(24.px)
        .withBorder(2.px)
        .endConfig()
        .buildRound(
            lineNumber,
            ContextCompat.getColor(imageView.context, R.color.white),
        )
}