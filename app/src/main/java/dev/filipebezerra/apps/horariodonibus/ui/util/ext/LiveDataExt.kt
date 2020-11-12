package dev.filipebezerra.apps.horariodonibus.ui.util.ext

import androidx.lifecycle.MutableLiveData
import dev.filipebezerra.apps.horariodonibus.ui.util.event.Event

fun <T> MutableLiveData<Event<T>>.postEvent(content: T) {
    postValue(Event(content))
}