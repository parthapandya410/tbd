package com.tbd.dto

data class RouteWithAvailableSeats(
    val route: List<pathInfo>,
    val trainID: String,
    val trainName: String,
    val fare: Int,
    val numberOfPartition: Int
)

data class pathInfo(
    val from: String,
    val to: String,
    val availableClass: String,
    val availableSeats: String,
    val isSeatAvailable: Boolean
)
