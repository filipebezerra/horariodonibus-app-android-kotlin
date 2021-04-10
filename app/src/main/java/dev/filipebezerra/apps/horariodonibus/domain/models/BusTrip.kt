package dev.filipebezerra.apps.horariodonibus.domain.models

data class BusTrip (
    val quality: String,
    val busNumber: String,
    val plannedArrivalTime: String,
    val estimatedArrivalTime: String,
    val arrivalForecast: Int
)