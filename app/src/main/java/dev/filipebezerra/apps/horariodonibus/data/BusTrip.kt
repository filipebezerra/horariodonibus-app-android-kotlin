package dev.filipebezerra.apps.horariodonibus.data

data class BusTrip(
    val quality: String,
    val busNumber: String,
    val plannedArrivalTime: String,
    val estimatedArrivalTime: String,
    val arrivalForecast: Int
)