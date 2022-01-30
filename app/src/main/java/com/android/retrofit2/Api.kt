package com.android.retrofit2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "22eb9935f5cbb4bd7868b8eac4ae13bb",
        @Query("language") language: String = "es",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "22eb9935f5cbb4bd7868b8eac4ae13bb",
        @Query("language") language: String = "es",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "22eb9935f5cbb4bd7868b8eac4ae13bb",
        @Query("language") language: String = "es",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/now_playing")
    fun getMoviesInCines(
        @Query("api_key") apiKey: String = "22eb9935f5cbb4bd7868b8eac4ae13bb",
        @Query("language") language: String = "es",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}