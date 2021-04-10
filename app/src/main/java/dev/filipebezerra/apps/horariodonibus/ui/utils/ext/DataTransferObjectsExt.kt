package dev.filipebezerra.apps.horariodonibus.ui.utils.ext

import dev.filipebezerra.apps.horariodonibus.domain.models.BusLine
import dev.filipebezerra.apps.horariodonibus.domain.models.BusTrip
import dev.filipebezerra.apps.horariodonibus.data.source.remote.ApiResponseTransferObject
import dev.filipebezerra.apps.horariodonibus.data.source.remote.BusLineTransferObject
import dev.filipebezerra.apps.horariodonibus.data.source.remote.BusTripTransferObject

fun BusTripTransferObject.asDomainModel() = BusTrip(
    quality = quality,
    busNumber = busNumber,
    plannedArrivalTime = plannedArrivalTime,
    estimatedArrivalTime = estimatedArrivalTime,
    arrivalForecast = arrivalForecast,
)

fun ApiResponseTransferObject<List<BusLineTransferObject>>.asDomainModel() = data.map {
    BusLine(
        lineNumber = it.lineNumber,
        destination = it.destination,
        nextTrip = it.nextTrip?.asDomainModel(),
        followingTrip = it.followingTrip?.asDomainModel(),
    )
}