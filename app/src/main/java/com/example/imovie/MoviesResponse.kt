package com.example.imovie

data class MoviesResponse(
    val searchType: String,
    val expression: String,
    val results: List<Movie>
)
