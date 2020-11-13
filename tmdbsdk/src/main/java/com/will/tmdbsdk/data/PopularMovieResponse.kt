package com.will.tmdbsdk.data

import com.squareup.moshi.Json

/**
 * @author WeiYi Yu
 * @date 2020-11-11
 */
data class PopularMovieResponse(
    @Json(name = "total_pages") val totalPages: Int,
    @Json(name = "results") val results: List<TmdbMovie>
)