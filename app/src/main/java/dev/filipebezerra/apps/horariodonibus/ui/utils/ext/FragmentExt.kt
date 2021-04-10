package dev.filipebezerra.apps.horariodonibus.ui.utils.ext

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dev.filipebezerra.apps.horariodonibus.ui.utils.event.SingleLiveEvent
import dev.filipebezerra.apps.horariodonibus.ui.utils.navigation.NavigationCommand

fun Fragment.hideKeyboard() {
    context?.let { context ->
        view?.let { view ->
            (context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager)
                .hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}

fun Fragment.observeNavigationCommand(navigationCommandEvent: SingleLiveEvent<NavigationCommand>) {
    navigationCommandEvent.observe(viewLifecycleOwner) { command ->
        when (command) {
            is NavigationCommand.To -> findNavController().navigate(command.directions)
            is NavigationCommand.Back -> findNavController().popBackStack()
            is NavigationCommand.BackTo -> findNavController().popBackStack(
                command.destinationId,
                false
            )
            is NavigationCommand.ForResult -> with(command) {
                // TODO: Migrate deprecated API
                startActivityForResult(
                    intent,
                    requestCode
                )
            }
        }
    }
}