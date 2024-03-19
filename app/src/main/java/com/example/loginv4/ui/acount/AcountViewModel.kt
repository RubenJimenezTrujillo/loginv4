package com.example.loginv4.ui.acount

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AcountViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Perfil de Usuario"
    }
    val text: LiveData<String> = _text
}