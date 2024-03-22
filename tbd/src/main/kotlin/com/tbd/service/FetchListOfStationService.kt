package com.tbd.service

import com.tbd.client.IRCTCClient
import com.tbd.constants.GREQ_VALUE
import com.tbd.dto.StationListItem
import com.tbd.dto.TrainSchedule

class FetchListOfStationService(
    private val irctcClient: IRCTCClient
) {

    private fun getTrainSchedule(trainID:String): TrainSchedule{
        return irctcClient.getTrainSchedule(GREQ_VALUE,trainID).body()
    }

    fun getListOfStation(sourceStation:String, destinationStation:String, trainID:String): List<StationListItem>{
        val effectiveStationList = mutableListOf<StationListItem>()
        var effectiveRoute = false
        getTrainSchedule(trainID).stationList?.let {
            it.forEach { station ->
                when(station.stationName){
                    sourceStation -> {
                        effectiveRoute = true
                        effectiveStationList.add(station)
                    }
                    destinationStation -> {
                        effectiveRoute = false
                        effectiveStationList.add(station)
                    }
                    else -> if(effectiveRoute){ effectiveStationList.add(station) }
                }
            }
        }
        return effectiveStationList
    }
}