package com.example.imovie

import android.telecom.Call

interface IMDbApi {
    @GET("/en/API/SearchMovie/API_KEY/{expression}")
    fun findMovie(@Path("expression") expression: String): Call<MoviesResponse>
}