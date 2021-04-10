package dev.filipebezerra.apps.horariodonibus.domain.models

data class BusLine(
    val lineNumber: String,
    val destination: String,
    val nextTrip: BusTrip?,
    val followingTrip: BusTrip?
) {
    override fun toString() = lineNumber
}