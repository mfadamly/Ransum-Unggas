package com.dicoding.fada.ransumunggas.ui.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dicoding.fada.ransumunggas.ui.layinghens.CriteriaLayingHensActivity
import com.dicoding.fada.ransumunggas.R
import com.dicoding.fada.ransumunggas.ui.broiler.CriteriaBroilerActivity

class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layingHens:CardView = view.findViewById(R.id.cvLayingHens)
        layingHens.setOnClickListener(this)

        val broiler:CardView = view.findViewById(R.id.cvBroiler)
        broiler.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.cvLayingHens -> {
                val moveIntent = Intent(activity, CriteriaLayingHensActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.cvBroiler -> {
                val moveIntent = Intent(activity, CriteriaBroilerActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}