package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.filipebezerra.apps.horariodonibus.data.BusLine
import dev.filipebezerra.apps.horariodonibus.data.BusTrip
import dev.filipebezerra.apps.horariodonibus.ui.util.event.Event
import dev.filipebezerra.apps.horariodonibus.ui.util.ext.postEvent

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
                    "2020-11-11T03:24:35-03:00",
                    "2020-11-11T04:24:35-03:00",
                    37
                ),
                BusTrip(
                    "Tempo Real",
                    "50156",
                    "2020-11-11T03:25:14-03:00",
                    "2020-11-11T04:25:14-03:00",
                    89
                )
            ),
            BusLine(
                "132",
                "ITANHANGA",
                BusTrip(
                    "Tempo Real",
                    "40024",
                    "2020-11-11T03:04:22-03:00",
                    "2020-11-11T04:04:22-03:00",
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
                    "2020-11-11T03:33:15-03:00",
                    "2020-11-11T04:33:15-03:00",
                    37
                ),
                null
            ),
        )
    }

    fun showNearbyBusStations() = _navigateToNearbyStations.postEvent(true)
}