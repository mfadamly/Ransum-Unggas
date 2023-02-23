package com.dicoding.fada.ransumunggas.ui.fragment.information

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfomationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is information Fragment"
    }
    val text: LiveData<String> = _text
}