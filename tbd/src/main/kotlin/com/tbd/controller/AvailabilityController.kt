package com.tbd.controller

import com.tbd.dto.AvailableTrainFilter
import com.tbd.dto.AvailableTrains
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller
class AvailabilityController {

    @Get("/availableTrains")
    fun getAvailableTrains(
        @QueryValue startingStation: String,
        @QueryValue endingStation: String
    ): List<AvailableTrains>{
        val availableTrainFilter = AvailableTrainFilter(startingStation,endingStation)
        return listOf(
            AvailableTrains("sabarmati","786"),
            AvailableTrains("vandebharat","108")
        )
    }
}