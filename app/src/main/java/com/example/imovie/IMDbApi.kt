package com.example.imovie

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApi {
    @GET("/en/API/SearchMovie/API_KEY/{expression}")
    fun findMovie(@Path("expression") expression: String): Call<MoviesResponse>
}