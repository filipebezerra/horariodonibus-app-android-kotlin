package dev.filipebezerra.apps.horariodonibus

import androidx.annotation.VisibleForTesting
import com.squareup.moshi.Moshi
import dev.filipebezerra.apps.horariodonibus.BuildConfig.BASE_API_URL
import dev.filipebezerra.apps.horariodonibus.data.source.remote.BusStationService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object ServiceLocator {
    private val lock = Any()

    private val moshiBuilder: Moshi.Builder by lazy { Moshi.Builder() }

    private val okHttpClientBuilder: OkHttpClient.Builder by lazy {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply { level =
                HttpLoggingInterceptor.Level.BODY
            })
            .readTimeout(30, TimeUnit.SECONDS)
            .callTimeout(60, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
    }

    private val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_API_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshiBuilder.build()))
            .client(okHttpClientBuilder.build())
    }

    @Volatile
    var busStationService: BusStationService? = null
        @VisibleForTesting set

    fun provideBusStationService(): BusStationService = synchronized(lock) {
        busStationService ?: createBusStationService()
    }

    private fun createBusStationService(): BusStationService =
        busStationService ?: retrofitBuilder.build().create(BusStationService::class.java).also {
            busStationService = it
        }
}