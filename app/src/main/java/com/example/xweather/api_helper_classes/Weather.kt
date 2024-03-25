package com.example.xweather.api_helper_classes

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)