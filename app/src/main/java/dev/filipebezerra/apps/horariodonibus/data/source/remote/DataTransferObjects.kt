package dev.filipebezerra.apps.horariodonibus.data.source.remote

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BusStationTransferObject(
    @Json(name = "IdPontoParada") val stationNumber: String,
    @Json(name = "Endereco") val address: String,
    @Json(name = "Latitude") val latitude: String,
    @Json(name = "Longitude") val longitude: String,
    @Json(name = "Linhas") val lines: List<BusLineTransferObject>,
)

@JsonClass(generateAdapter = true)
data class BusLineTransferObject(
    @Json(name = "Linha") val lineNumber: String,
    @Json(name = "Destino") val destination: String,
    @Json(name = "Proximo") val nextTrip: BusTripTransferObject?,
    @Json(name = "Seguinte") val followingTrip: BusTripTransferObject?,
)

@JsonClass(generateAdapter = true)
data class BusTripTransferObject (
    @Json(name = "Qualidade") val quality: String,
    @Json(name = "NumeroOnibus") val busNumber: String,
    @Json(name = "HoraChegadaPlanejada") val plannedArrivalTime: String,
    @Json(name = "HoraChegadaPrevista") val estimatedArrivalTime: String,
    @Json(name = "PrevisaoChegada") val arrivalForecast: Int
)

@JsonClass(generateAdapter = true)
data class ApiResponseTransferObject<T>(
    @Json(name = "status") val status: String,
    @Json(name = "mensagem") val message: String,
    @Json(name = "data") val data: T,
)