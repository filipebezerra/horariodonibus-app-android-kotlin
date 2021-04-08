package dev.filipebezerra.apps.horariodonibus.ui.bustrip

import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import dev.filipebezerra.apps.horariodonibus.R
import dev.filipebezerra.apps.horariodonibus.data.BusLine

@BindingAdapter("busLineList")
fun bindBusLineList(
    autoCompleteTextView: AutoCompleteTextView,
    busLineList: List<BusLine>
) = ArrayAdapter(
    autoCompleteTextView.context,
    R.layout.dropdown_menu_popup_item,
    busLineList
).let { adapter ->
    autoCompleteTextView.setAdapter(adapter)
}

@BindingAdapter("selectedBusLine")
fun bindSelectedBusLine(view: MaterialAutoCompleteTextView, selectedBusLine: BusLine) {
    view.setText(selectedBusLine.lineNumber, false)
}