package com.example.loginv4.ui.drive

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DriveViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Área del mapa"
    }
    val text: LiveData<String> = _text
}