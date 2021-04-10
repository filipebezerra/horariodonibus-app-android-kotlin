package dev.filipebezerra.apps.horariodonibus.ui.base

import androidx.lifecycle.ViewModel
import dev.filipebezerra.apps.horariodonibus.ui.utils.event.SingleLiveEvent
import dev.filipebezerra.apps.horariodonibus.ui.utils.navigation.NavigationCommand

/**
 * Base class for View Models to declare the common LiveData objects in one place
 */
abstract class ViewModelBase : ViewModel() {
    val navigationCommand: SingleLiveEvent<NavigationCommand> = SingleLiveEvent()
}