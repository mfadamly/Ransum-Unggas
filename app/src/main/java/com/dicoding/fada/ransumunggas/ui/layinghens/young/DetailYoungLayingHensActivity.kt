package com.dicoding.fada.ransumunggas.ui.layinghens.young

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.fada.ransumunggas.databinding.ActivityDetailYoungLayingHensBinding
import com.dicoding.fada.ransumunggas.data.Data

class DetailYoungLayingHensActivity : AppCompatActivity() {
    private lateinit var detailYoungLayingHensBinding: ActivityDetailYoungLayingHensBinding
    private var chosenId: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailYoungLayingHensBinding = ActivityDetailYoungLayingHensBinding.inflate(layoutInflater)
        setContentView(detailYoungLayingHensBinding.root)

        chosenId = intent.getIntExtra("CHOSENID", 0)
        getData()
    }

    private fun getData() {
        val dataBabyBroiler = Data.generateYoungLayingHens()

        dataBabyBroiler.forEach { data ->
            when (chosenId) {
                data.id -> {
                    detailYoungLayingHensBinding.textView1.text = data.bahan_1
                    detailYoungLayingHensBinding.textView2.text = data.bahan_2
                    detailYoungLayingHensBinding.textView3.text = data.bahan_3
                    detailYoungLayingHensBinding.textView4.text = data.bahan_4
                    detailYoungLayingHensBinding.textView5.text = data.bahan_5
                }
            }
        }
    }
}