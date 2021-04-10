package dev.filipebezerra.apps.horariodonibus.data.source.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface BusStationService {

    @GET("pontoparada/previsaochegada")
    suspend fun getArrivalForecast(
        @Query("qryIdPontoParada") busStationNumber: String,
        @Query("qryLinha") busLineNumber: String = "",
    ): ApiResponseTransferObject<List<BusLineTransferObject>>
}