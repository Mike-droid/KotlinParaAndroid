package com.platzi.conf.view.ui.adapter

import com.platzi.conf.model.Conference

interface ScheduleListener {
    fun onConferenceClicked(conference: Conference, position: Int)
}