package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.filipebezerra.apps.horariodonibus.data.BusStation
import dev.filipebezerra.apps.horariodonibus.data.BusTrip

class DashboardViewModel : ViewModel() {

    private val _busStations = MutableLiveData<List<BusStation>>()
    val busStations: LiveData<List<BusStation>>
        get() = _busStations

    init {
        _busStations.value = mutableListOf(
            BusStation(
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
            BusStation(
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
            BusStation(
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

    fun showNearbyBusStations() {

    }
}