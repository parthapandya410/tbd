package com.tbd.service

import com.tbd.dto.StationListItem
import com.tbd.service.api.IFindRouteService

class FindRouteService : IFindRouteService {

    override fun getAvailableSeats(listOfStation:List<StationListItem>,doj:String) {
        TODO("Not yet implemented")
        val lastStation = listOfStation.last()
        listOfStation.forEach {
            
        }
    }

}