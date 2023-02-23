package com.dicoding.fada.ransumunggas.ui.fragment.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dicoding.fada.ransumunggas.R

class InformationFragment : Fragment() {

    private lateinit var infomationViewModel: InfomationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        infomationViewModel =
            ViewModelProvider(this).get(InfomationViewModel::class.java)
        return inflater.inflate(R.layout.fragment_information, container, false)
    }
}