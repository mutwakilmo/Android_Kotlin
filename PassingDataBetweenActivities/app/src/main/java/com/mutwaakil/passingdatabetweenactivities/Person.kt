package com.mutwaakil.passingdatabetweenactivities

import java.io.Serializable

/**
 * Created by Mutwakil-Mo 🤩
 * Android Engineer,
 * Brussels
 */
data class Person (
    val name :String,
    val age :Int,
    val country :String
)  : Serializable