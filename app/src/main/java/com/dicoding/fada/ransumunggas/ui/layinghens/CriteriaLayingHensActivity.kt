package com.dicoding.fada.ransumunggas.ui.layinghens

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.dicoding.fada.ransumunggas.R
import com.dicoding.fada.ransumunggas.ui.layinghens.adult.AdultLayingHensActivity
import com.dicoding.fada.ransumunggas.ui.layinghens.baby.BabyLayingHensActivity
import com.dicoding.fada.ransumunggas.ui.layinghens.young.YoungLayingHensActivity

class CriteriaLayingHensActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criteria_laying_hens)

        val babyLayingHens: CardView = findViewById(R.id.babyLayingHens)
        babyLayingHens.setOnClickListener(this)

        val youngLayingHens: CardView = findViewById(R.id.youngLayingHens)
        youngLayingHens.setOnClickListener(this)

        val adultLayingHens: CardView = findViewById(R.id.adultLayingHens)
        adultLayingHens.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.babyLayingHens -> {
                val moveIntent = Intent(this, BabyLayingHensActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.youngLayingHens -> {
                val moveIntent = Intent(this, YoungLayingHensActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.adultLayingHens -> {
                val moveIntent = Intent(this, AdultLayingHensActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}