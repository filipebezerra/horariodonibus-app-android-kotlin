package dev.filipebezerra.apps.horariodonibus.data

data class BusStation(
    val stationNumber: String,
    val address: String,
    val latitude: String,
    val longitude: String,
    val lines: List<BusLine>,
)