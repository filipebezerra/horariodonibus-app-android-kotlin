package dev.filipebezerra.apps.horariodonibus.ui.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter
import net.danlew.android.joda.DateUtils
import org.joda.time.DateTime

@BindingAdapter("relativeTimeSpan")
fun bindRelativeTimeSpan(textView: TextView, dateTimeText: String?) {
    dateTimeText?.let {
        textView.text = DateUtils.getRelativeTimeSpanString(
            textView.context,
            DateTime.parse(it),
            DateUtils.FORMAT_ABBREV_RELATIVE
        )
    }
}