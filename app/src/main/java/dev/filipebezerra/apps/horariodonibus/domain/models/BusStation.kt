package dev.filipebezerra.apps.horariodonibus.domain.models

data class BusStation(
    val stationNumber: String,
    val address: String,
    val latitude: String,
    val longitude: String,
    val lines: List<BusLine>,
)