package com.dicoding.fada.ransumunggas.ui.broiler

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.dicoding.fada.ransumunggas.R
import com.dicoding.fada.ransumunggas.ui.broiler.adult.AdultBroilerActivity
import com.dicoding.fada.ransumunggas.ui.broiler.baby.BabyBroilerActivity

class CriteriaBroilerActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criteria_broiler)

        val babyBroiler: CardView = findViewById(R.id.babyBroilerLayout)
        babyBroiler.setOnClickListener(this)

        val adultBroiler: CardView = findViewById(R.id.adultBroilerLayout)
        adultBroiler.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.babyBroilerLayout -> {
                val moveIntent = Intent(this, BabyBroilerActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.adultBroilerLayout -> {
                val moveIntent = Intent(this, AdultBroilerActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}