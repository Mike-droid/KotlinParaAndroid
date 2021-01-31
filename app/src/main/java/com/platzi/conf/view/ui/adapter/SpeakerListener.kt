package com.platzi.conf.view.ui.adapter

import com.platzi.conf.model.Speaker

interface SpeakerListener {
    fun onSpeakerClicked(speaker: Speaker, position:Int)
}