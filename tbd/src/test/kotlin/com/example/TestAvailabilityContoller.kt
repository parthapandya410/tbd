package com.example

import com.example.dto.AvailableTrainFilter
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@MicronautTest
class TestAvailabilityContoller {

    @Inject
    private lateinit var availabilityController: AvailabilityController

    @Test
    fun `test availability controller`() {
        val response = availabilityController.getAvailableTrains(
            AvailableTrainFilter(
                "some",
                "train"
            )
        )
        Assertions.assertEquals(2,response.size)
        Assertions.assertEquals("sabarmati",response[0].trainName)
        Assertions.assertEquals("786",response[0].trainNumber)
    }
}