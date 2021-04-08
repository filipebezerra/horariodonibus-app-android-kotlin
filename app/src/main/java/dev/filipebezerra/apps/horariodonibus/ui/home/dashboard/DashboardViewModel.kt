package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.filipebezerra.apps.horariodonibus.data.BusLine
import dev.filipebezerra.apps.horariodonibus.data.BusTrip
import dev.filipebezerra.apps.horariodonibus.ui.utils.event.Event
import dev.filipebezerra.apps.horariodonibus.ui.utils.ext.postEvent
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormatter

class DashboardViewModel : ViewModel() {

    private val _busLines = MutableLiveData<List<BusLine>>()
    val busLines: LiveData<List<BusLine>>
        get() = _busLines

    private val _navigateToNearbyStations = MutableLiveData<Event<Any>>()
    val navigateToNearbyStations: LiveData<Event<Any>>
        get() = _navigateToNearbyStations

    init {
        _busLines.value = listOf(
            BusLine(
                "035",
                "5698 - Avenida 85",
                BusTrip(
                    "Tempo Real",
                    "50290",
                    DateTime.now().plusMinutes(20).toString(),
                    DateTime.now().plusMinutes(30).toString(),
                    37
                ),
                BusTrip(
                    "Tempo Real",
                    "50156",
                    DateTime.now().plusMinutes(30).toString(),
                    DateTime.now().plusHours(1).toString(),
                    89
                )
            ),
            BusLine(
                "132",
                "ITANHANGA",
                BusTrip(
                    "Tempo Real",
                    "40024",
                    DateTime.now().plusMinutes(5).toString(),
                    DateTime.now().plusMinutes(16).toString(),
                    68
                ),
                null
            ),
            BusLine(
                "270",
                "CENTRO",
                BusTrip(
                    "Tempo Real",
                    "40045",
                    DateTime.now().plusMinutes(15).toString(),
                    DateTime.now().plusMinutes(45).toString(),
                    37
                ),
                null
            ),
        )
    }

    fun showNearbyBusStations() = _navigateToNearbyStations.postEvent(true)
}