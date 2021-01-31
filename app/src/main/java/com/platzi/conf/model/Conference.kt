package com.platzi.conf.model

import java.io.Serializable
import java.util.*

class Conference: Serializable{
    var title: String = ""
    var description: String = ""
    var tag: String = ""
    lateinit var datetime: Date //No sé cómo llenar esto
    var speaker:String = ""
}