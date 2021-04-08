package dev.filipebezerra.apps.horariodonibus.ui.utils.ext

import androidx.lifecycle.MutableLiveData
import dev.filipebezerra.apps.horariodonibus.ui.utils.event.Event

fun <T> MutableLiveData<Event<T>>.postEvent(content: T) {
    postValue(Event(content))
}