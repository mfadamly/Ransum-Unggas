package com.dicoding.fada.ransumunggas.ui.broiler.baby

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.fada.ransumunggas.databinding.ActivityDetailBabyBroilerBinding
import com.dicoding.fada.ransumunggas.data.Data

class DetailBabyBroilerActivity : AppCompatActivity() {
    private lateinit var detailBabyBroilerBinding: ActivityDetailBabyBroilerBinding
    private var chosenId: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBabyBroilerBinding = ActivityDetailBabyBroilerBinding.inflate(layoutInflater)
        setContentView(detailBabyBroilerBinding.root)

        chosenId = intent.getIntExtra("CHOSENID", 0)
        getData()
    }

    private fun getData() {
        val dataBabyBroiler = Data.generateBabyBroiler()

        dataBabyBroiler.forEach { data ->
            when (chosenId) {
                data.id -> {
                    detailBabyBroilerBinding.textView1.text = data.bahan_1
                    detailBabyBroilerBinding.textView2.text = data.bahan_2
                    detailBabyBroilerBinding.textView3.text = data.bahan_3
                    detailBabyBroilerBinding.textView4.text = data.bahan_4
                    detailBabyBroilerBinding.textView5.text = data.bahan_5
                }
            }
        }
    }
}