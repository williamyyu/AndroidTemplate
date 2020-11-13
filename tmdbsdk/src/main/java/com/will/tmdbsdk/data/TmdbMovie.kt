package com.will.tmdbsdk.data

import com.squareup.moshi.Json

/**
 * @author WeiYi Yu
 * @date 2020-11-11
 */
data class TmdbMovie(
    @Json(name = "id") val id: String,
    @Json(name = "title") val title: String,
    @Json(name = "vote_average") val voteAverage: Double,
    @Json(name = "poster_path") val posterPath: String,
)