package com.tbd.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.tbd.constants.PAYMENT_FLAG_DEFAULT_VALUE

data class QueryAvailability(
	@JsonProperty("isLogedinReq") val isLogedinReq: Boolean? = false,
	@JsonProperty("classCode") val classCode: String? = null,
	@JsonProperty("returnJourney") val returnJourney: Boolean? = false,
	@JsonProperty("journeyDate") val journeyDate: String? = null,
	@JsonProperty("ticketType") val ticketType: String? = "E",
	@JsonProperty("moreThanOneDay") val moreThanOneDay: Boolean? = null,
	@JsonProperty("ftBooking") val ftBooking: Boolean? = false,
	@JsonProperty("concessionBooking") val concessionBooking: Boolean? = false,
	@JsonProperty("fromStnCode") val fromStnCode: String? = null,
	@JsonProperty("toStnCode") val toStnCode: String? = null,
	@JsonProperty("returnTicket") val returnTicket: Boolean? = false,
	@JsonProperty("loyaltyRedemptionBooking") val loyaltyRedemptionBooking: Boolean? = false,
	@JsonProperty("paymentFlag") val paymentFlag: String? = PAYMENT_FLAG_DEFAULT_VALUE,
	@JsonProperty("trainNumber") val trainNumber: String? = null,
	@JsonProperty("quotaCode") val quotaCode: String? = null
)

