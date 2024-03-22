package com.tbd.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class TrainSchedule(
	@JsonProperty("trainName") val trainName: String? = null,
	@JsonProperty("trainNumber") val trainNumber: String? = null,
	@JsonProperty("stationFrom") val stationFrom: String? = null,
	@JsonProperty("stationTo") val stationTo: String? = null,
	@JsonProperty("trainRunsOnMon") val trainRunsOnMon: String? = null,
	@JsonProperty("trainRunsOnTue") val trainRunsOnTue: String? = null,
	@JsonProperty("trainRunsOnWed") val trainRunsOnWed: String? = null,
	@JsonProperty("trainRunsOnThu") val trainRunsOnThu: String? = null,
	@JsonProperty("trainRunsOnFri") val trainRunsOnFri: String? = null,
	@JsonProperty("trainRunsOnSat") val trainRunsOnSat: String? = null,
	@JsonProperty("trainRunsOnSun") val trainRunsOnSun: String? = null,
	@JsonProperty("trainOwner") val trainOwner: String? = null,
	@JsonProperty("timeStamp") val timeStamp: String? = null,
	@JsonProperty("duration") val duration: String? = null,
	@JsonProperty("stationList") val stationList: List<StationListItem>? = null
)

data class StationListItem(
	@JsonProperty("departureTime") val departureTime: String? = null,
	@JsonProperty("stationCode") val stationCode: String? = null,
	@JsonProperty("haltTime") val haltTime: String? = null,
	@JsonProperty("routeNumber") val routeNumber: String? = null,
	@JsonProperty("dayCount") val dayCount: String? = null,
	@JsonProperty("distance") val distance: String? = null,
	@JsonProperty("arrivalTime") val arrivalTime: String? = null,
	@JsonProperty("stationName") val stationName: String? = null,
	@JsonProperty("stnSerialNumber") val stnSerialNumber: String? = null,
	@JsonProperty("boardingDisabled") val boardingDisabled: String? = null
)

