package dev.filipebezerra.apps.horariodonibus.ui.bustrip

import androidx.lifecycle.*
import dev.filipebezerra.apps.horariodonibus.data.BusLine
import dev.filipebezerra.apps.horariodonibus.data.BusStation
import dev.filipebezerra.apps.horariodonibus.data.BusTrip
import org.joda.time.LocalDateTime
import org.joda.time.format.ISODateTimeFormat

class BusTripViewModel private constructor(
    private val stationNumber: String,
    private val selectedBusLineNumber: String,
) : ViewModel() {

    private val _busStation = MutableLiveData<BusStation>()
    val busStation: LiveData<BusStation>
        get() = _busStation

    val selectedBusLine = Transformations.map(_busStation) { busStation ->
        busStation.lines.first { line -> line.lineNumber == selectedBusLineNumber }
    }

    val selectedBusLinePosition = Transformations.map(_busStation) { busStation ->
        busStation.lines.indexOfFirst { line -> line.lineNumber == selectedBusLineNumber }
    }

    init {
        _busStation.value = BusStation(
            stationNumber = "508",
            address = "Rua 82 (praca Civica), Setor Central - Goiania",
            latitude = "-16.681950",
            longitude = "-49.257643",
            lines = listOf(
                BusLine(
                    lineNumber = "004",
                    destination = "T. Garavelo / Centro - Eixo T-9",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "008",
                    destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "013",
                    destination = "T. Rec. Bosque / Rodoviária / Centro",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "017",
                    destination = "T. Cruzeiro / Centro / Rodoviária",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "019",
                    destination = "T. Cruzeiro / T. Bíblia",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "035",
                    destination = "T. Garavelo / Rodoviária - Eixo T-63",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "175",
                    destination = "T. Bandeiras / T. Bíblia via T-63",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "268",
                    destination = "PC Campus / Criméia Leste / Centro",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "269",
                    destination = "PC Campus / Goiânia II / Centro",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "270",
                    destination = "PC Campus / Rodoviária / Centro",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "277",
                    destination = "T. Cruzeiro / Pq. Amazônia / Rodoviária",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "300",
                    destination = "T. Bíblia / Praça Cívica",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "401",
                    destination = "Circular - Via Praça Walter Santos",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "909",
                    destination = " Forteville / T. Bandeiras / Rodoviária",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
                BusLine(
                    lineNumber = "919",
                    destination = "Av. T-10 / T. Isidória",
                    nextTrip = BusTrip(
                        "real",
                        "4040",
                        plannedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(10)
                        ),
                        estimatedArrivalTime = ISODateTimeFormat.dateHourMinuteSecondMillis().print(
                            LocalDateTime.now().plusMinutes(11)
                        ),
                        arrivalForecast = 1
                    ),
                    followingTrip = null,
                ),
            ),
        )
    }

    companion object {
        @Suppress("UNCHECKED_CAST")
        fun provideFactory(
            stationNumber: String,
            selectedBusLineNumber: String,
        ): ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T =
                BusTripViewModel(
                    stationNumber,
                    selectedBusLineNumber,
                ) as T
        }
    }
}