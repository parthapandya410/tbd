package com.example

import com.example.dto.AvailableTrainFilter
import com.example.dto.AvailableTrains
import com.sun.xml.internal.bind.v2.TODO
import io.micronaut.http.annotation.Body
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