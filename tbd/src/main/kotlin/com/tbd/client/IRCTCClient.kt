package com.tbd.client

import com.tbd.constants.*
import com.tbd.dto.QueryAvailability
import com.tbd.dto.SeatsAvailabilityDTO
import com.tbd.dto.TrainSchedule
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client

@Client("\${irctc-client.url}")
interface IRCTCClient {

    @Get("/trnscheduleenquiry/{trainNumber}")
    fun getTrainSchedule(
        @Header(GREQ) greq: String,
        @PathVariable(TRAIN_NUMBER) trainNumber: String,
    ): HttpResponse<TrainSchedule>

    @Post("/avlFarenquiry/{trainID}/{doj}/{srcStation}/{destStation}/{classType}/{quota}/{paymentFlag}")
    fun getSeatAvailability(
            @Header(GREQ) greq: String,
            @PathVariable(TRAIN_ID) trainID: String,
            @PathVariable(DOJ) doj: String,
            @PathVariable(SRC_STATION) srcStation: String,
            @PathVariable(DEST_STAION) destStation: String,
            @PathVariable(PAYMENT_FLAG) paymentFlag: String,
            @PathVariable(QUOTA) quota: String,
            @PathVariable(CLASS) classType: String,
            @Body querySeatAvailability: QueryAvailability
    ): HttpResponse<SeatsAvailabilityDTO>
}