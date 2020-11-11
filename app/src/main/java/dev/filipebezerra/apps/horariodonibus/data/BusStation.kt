package dev.filipebezerra.apps.horariodonibus.data

data class BusStation(
    val lineNumber: String,
    val destination: String,
    val nextTrip: BusTrip?,
    val followingTrip: BusTrip?
)