package com.amm.kotlindsl.adomain

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class Vehicle

fun main() {
    Vehicle() speed 10
}

private infix fun Vehicle.speed(amount: Int) {
    logger.info("speed of the vehicle is $amount")
}

