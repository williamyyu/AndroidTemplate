package com.will.tmdbsdk

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.will.tmdbsdk.data.PopularMovieResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.BASIC
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

/**
 * @author WeiYi Yu
 * @date 2020-11-11
 */

/**
 * [API doc](https://developers.themoviedb.org/3/movies)
 */
interface TmdbService {
    @GET("movie/popular")
    suspend fun getPopularMovies(): PopularMovieResponse

    companion object {
        fun create(): TmdbService {
            val logger = HttpLoggingInterceptor().apply { level = BASIC }

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(logger)
                .addInterceptor {
                    // Intercept the request and add the `api_key` into the request
                    // So we don't have to pass the `api_key` into every request
                    var request = it.request()
                    val url = request.url.newBuilder()
                        .addQueryParameter("api_key", BuildConfig.TMDB_API_KEY).build()
                    request = request.newBuilder().url(url).build()
                    it.proceed(request)
                }
                .build()

            val moshiConverter = MoshiConverterFactory.create(
                Moshi.Builder()
                    .add(KotlinJsonAdapterFactory())
                    .build()
            )

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BuildConfig.TMDB_BASE_URL)
                .addConverterFactory(moshiConverter)
                .build()
                .create(TmdbService::class.java)
        }
    }
}