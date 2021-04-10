package dev.filipebezerra.apps.horariodonibus.ui.nearbystations

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.filipebezerra.apps.horariodonibus.domain.models.BusLine
import dev.filipebezerra.apps.horariodonibus.domain.models.BusStation
import dev.filipebezerra.apps.horariodonibus.domain.models.BusTrip
import org.joda.time.LocalDateTime
import org.joda.time.format.ISODateTimeFormat

class NearbyStationsViewModel : ViewModel() {

    private val _busStations = MutableLiveData<List<BusStation>>()
    val busStations: LiveData<List<BusStation>>
        get() = _busStations

    init {
        _busStations.value = listOf(
            BusStation(
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
                            plannedArrivalTime = ISODateTimeFormat.basicDateTime().print(LocalDateTime.now().plusMinutes(10)),
                            estimatedArrivalTime = ISODateTimeFormat.basicDateTime().print(LocalDateTime.now().plusMinutes(11)),
                            arrivalForecast = 1
                        ),
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "017",
                        destination = "T. Cruzeiro / Centro / Rodoviária",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "019",
                        destination = "T. Cruzeiro / T. Bíblia",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "035",
                        destination = "T. Garavelo / Rodoviária - Eixo T-63",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "175",
                        destination = "T. Bandeiras / T. Bíblia via T-63",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "268",
                        destination = "PC Campus / Criméia Leste / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "269",
                        destination = "PC Campus / Goiânia II / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "270",
                        destination = "PC Campus / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "277",
                        destination = "T. Cruzeiro / Pq. Amazônia / Rodoviária",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "300",
                        destination = "T. Bíblia / Praça Cívica",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "401",
                        destination = "Circular - Via Praça Walter Santos",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "909",
                        destination = " Forteville / T. Bandeiras / Rodoviária",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "919",
                        destination = "Av. T-10 / T. Isidória",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "108",
                address = "Rua 99 (praca Civica), Setor Central - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "200",
                address = "Rua 99 (praca Civica), Setor Central - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "700",
                address = "Rua Ali, Setor Alice - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "601",
                address = "Rua Rodolfo, Setor Flores - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "10",
                address = "Rua Lírios, Setor Flowers - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "88",
                address = "Rua Faca, Setor Manteiga - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "366",
                address = "Rua Caramelo, Setor Chá - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "223",
                address = "Rua Sonho, Setor Mil Maravilhas - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "301",
                address = "Rua Ursinhos carinhosos, Setor Favo de mel - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
            BusStation(
                stationNumber = "001",
                address = "Rua Tristeza, Setor Alegre - Goiania",
                latitude = "-16.681950",
                longitude = "-49.257643",
                lines = listOf(
                    BusLine(
                        lineNumber = "004",
                        destination = "T. Garavelo / Centro - Eixo T-9",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "008",
                        destination = "T. Veiga Jd. / Rodoviária - Eixo 85",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                    BusLine(
                        lineNumber = "013",
                        destination = "T. Rec. Bosque / Rodoviária / Centro",
                        nextTrip = null,
                        followingTrip = null,
                    ),
                ),
            ),
        )
    }
}