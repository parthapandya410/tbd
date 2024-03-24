package com.tbd.service

import com.tbd.client.IRCTCClient
import com.tbd.constants.CLASS_DEFAULT_VALUE
import com.tbd.constants.GREQ_VALUE
import com.tbd.constants.PAYMENT_FLAG_DEFAULT_VALUE
import com.tbd.constants.QUOTA_DEFAULT_VALUE
import com.tbd.dto.QueryAvailability
import com.tbd.dto.SeatsAvailabilityDTO
import com.tbd.dto.StationListItem
import com.tbd.service.api.IFindRouteService

class FindRouteService(
        private val irctcClient: IRCTCClient
) : IFindRouteService{

    override fun getAvailableSeats(listOfStation:List<StationListItem>,doj:String,trainID:String): MutableList<SeatsAvailabilityDTO> {
        var response : SeatsAvailabilityDTO
        val listOfSeatAvailability = mutableListOf<SeatsAvailabilityDTO>()
                listOfStation.forEach {currentStation ->
            listOfStation.reversed().forEach {
                response = irctcClient.getSeatAvailability(
                        GREQ_VALUE,
                        trainID,
                        doj,
                        currentStation.stationCode!!,
                        it.stationCode!!,
                        PAYMENT_FLAG_DEFAULT_VALUE,
                        QUOTA_DEFAULT_VALUE,
                        CLASS_DEFAULT_VALUE,
                        QueryAvailability()
                ).body()!!
                println(response)
                listOfSeatAvailability.add(response)
            }
        }
        return listOfSeatAvailability
    }

}