package com.tbd.service.api

import com.tbd.dto.StationListItem

interface IFindRouteService {

    fun getAvailableSeats(listOfStation: List<StationListItem>,doj: String)

}