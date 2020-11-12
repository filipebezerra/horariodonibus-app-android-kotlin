package dev.filipebezerra.apps.horariodonibus.data

data class BusLine(
    val lineNumber: String,
    val destination: String,
    val nextTrip: BusTrip?,
    val followingTrip: BusTrip?
)