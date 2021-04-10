package dev.filipebezerra.apps.horariodonibus.ui.home.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.filipebezerra.apps.horariodonibus.data.source.remote.BusStationService
import dev.filipebezerra.apps.horariodonibus.domain.models.BusLine
import dev.filipebezerra.apps.horariodonibus.domain.models.BusTrip
import dev.filipebezerra.apps.horariodonibus.ui.base.ViewModelBase
import dev.filipebezerra.apps.horariodonibus.ui.utils.navigation.NavigationCommand.To
import org.joda.time.DateTime
import dev.filipebezerra.apps.horariodonibus.ui.home.HomeScreenDirections.Companion.actionHomeScreenToNearbyStationsScreen as nearbyStationsScreen

class DashboardViewModel(
    private val busStationService: BusStationService
) : ViewModelBase() {

    private val _busLines = MutableLiveData<List<BusLine>>()
    val busLines: LiveData<List<BusLine>>
        get() = _busLines

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

    fun showNearbyBusStations() {
        navigationCommand.value = To(nearbyStationsScreen())
    }

    companion object {
        @Suppress("UNCHECKED_CAST")
        fun createViewModelFactory(busStationService: BusStationService) =
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel?> create(modelClass: Class<T>): T =
                    DashboardViewModel(busStationService) as T
            }
    }
}