package com.tbd.controller

import com.tbd.dto.AvailableTrainFilter
import com.tbd.dto.AvailableTrains
import com.tbd.dto.RouteWithAvailableSeats
import com.tbd.dto.SeatsAvailabilityDTO
import com.tbd.service.api.IFindRouteService
import com.tbd.service.FetchListOfStationService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue

@Controller
class AvailabilityController(
    private val fetchListOfStationService: FetchListOfStationService,
    private val findRouteService: IFindRouteService
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

//    @Get("/trainSchedule/{trainNumber}")
//    fun getTrainSchedule(
//        @PathVariable trainNumber: String
//    ): TrainSchedule{
//        return irctcClient.getTrainSchedule(GREQ_VALUE,trainNumber).body()
//    }

    @Get("/trains/{sourceStation}/{destinationStation}/{dateOfJourney}/{trainID}/availableSeats")
    fun getTheRouteWithAvailableSeats(
        @PathVariable trainID: String,
        @QueryValue sourceStation: String,
        @QueryValue destinationStation: String,
        @QueryValue dateOfJourney: String
    ): MutableList<SeatsAvailabilityDTO> {
        val listOfStations = fetchListOfStationService.getListOfStation(sourceStation,destinationStation,trainID)
        val routeWithAvailableSeats = findRouteService.getAvailableSeats(listOfStations,dateOfJourney,trainID)
        return routeWithAvailableSeats
    }

}