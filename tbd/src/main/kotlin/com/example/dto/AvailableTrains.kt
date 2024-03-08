package com.example.dto

import java.util.Date

data class AvailableTrains(
    val trainName: String,
    val trainNumber: String
)

data class AvailableTrainFilter(
    val startStationCode: String,
    val endStationCode: String
)
