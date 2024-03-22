package com.tbd.dto

data class AvailableTrains(
    val trainName: String,
    val trainNumber: String
)

data class AvailableTrainFilter(
    val startStationCode: String,
    val endStationCode: String
)
