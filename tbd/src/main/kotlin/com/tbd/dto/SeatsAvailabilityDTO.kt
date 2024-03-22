package com.tbd.dto

data class SeatsAvailabilityDTO(
	val altTrainEnabled: String? = null,
	val baseFare: String? = null,
	val totalFare: String? = null,
	val dynamicFare: String? = null,
	val altAvlEnabled: String? = null,
	val distance: String? = null,
	val serviceTax: String? = null,
	val upiRdsFlag: String? = null,
	val enqClass: String? = null,
	val trainNo: String? = null,
	val tatkalFare: String? = null,
	val taRdsFlag: String? = null,
	val reqEnqParam: String? = null,
	val fuelAmount: String? = null,
	val insuredPsgnCount: String? = null,
	val cateringFlag: String? = null,
	val otpAuthenticationFlag: String? = null,
	val trainName: String? = null,
	val quota: String? = null,
	val from: String? = null,
	val avlDayList: List<AvlDayListItem?>? = null,
	val cateringCharge: String? = null,
	val preEnqDate: String? = null,
	val reservationCharge: String? = null,
	val travelInsuranceCharge: String? = null,
	val travelInsuranceServiceTax: String? = null,
	val totalCollectibleAmount: String? = null,
	val ftBookingMsgFlag: String? = null,
	val rdsTxnPwdFlag: String? = null,
	val timeStamp: String? = null,
	val otherCharge: String? = null,
	val nextEnqDate: String? = null,
	val informationMessage: List<InformationMessageItem?>? = null,
	val to: String? = null,
	val totalConcession: String? = null,
	val reTry: String? = null,
	val superfastCharge: String? = null,
	val altClsEnabled: String? = null
)

data class InformationMessageItem(
	val popup: String? = null,
	val paramName: String? = null,
	val message: String? = null
)

data class AvlDayListItem(
	val currentBkgFlag: String? = null,
	val delay: String? = null,
	val availablityStatus: String? = null,
	val wlType: String? = null,
	val availablityDate: String? = null,
	val reasonType: String? = null,
	val delayFlag: String? = null,
	val availablityType: String? = null
)

