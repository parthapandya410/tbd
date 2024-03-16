package com.tbd.controller

import com.tbd.client.IRCTCClient
import com.tbd.constants.GREQ_VALUE
import com.tbd.dto.AvailableTrainFilter
import com.tbd.dto.AvailableTrains
import com.tbd.dto.TrainSchedule
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue

@Controller
class AvailabilityController(
    private val irctcClient: IRCTCClient
) {

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

    @Get("/trainSchedule/{trainNumber}")
    fun getTrainSchedule(
        @PathVariable trainNumber: String
    ): TrainSchedule{
        return irctcClient.getTrainSchedule(GREQ_VALUE,trainNumber).body()
    }
}