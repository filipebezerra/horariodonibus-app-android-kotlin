package dev.filipebezerra.apps.horariodonibus.ui.util.ext

import android.content.res.Resources

private val density by lazy { Resources.getSystem().displayMetrics.density }

val Int.dp: Int
    get() = (this / density).toInt()

val Int.px: Int
    get() = (this * density).toInt()