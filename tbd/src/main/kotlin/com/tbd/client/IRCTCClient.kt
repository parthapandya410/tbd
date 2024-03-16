package com.tbd.client

import com.tbd.constants.GREQ
import com.tbd.constants.TRAIN_NUMBER
import com.tbd.dto.TrainSchedule
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

@Client("\${irctc-client.url}")
interface IRCTCClient {

    @Get("/trnscheduleenquiry/{trainNumber}")
    fun getTrainSchedule(
        @Header(GREQ) greq: String,
        @PathVariable(TRAIN_NUMBER) trainNumber: String,
    ): HttpResponse<TrainSchedule>
}