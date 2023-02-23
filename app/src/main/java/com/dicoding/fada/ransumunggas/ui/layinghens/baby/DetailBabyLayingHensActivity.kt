package com.dicoding.fada.ransumunggas.ui.layinghens.baby

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.fada.ransumunggas.databinding.ActivityDetailBabyLayingHensBinding
import com.dicoding.fada.ransumunggas.data.Data

class DetailBabyLayingHensActivity : AppCompatActivity() {
    private lateinit var detailBabyLayingHensBinding: ActivityDetailBabyLayingHensBinding
    private var chosenId: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBabyLayingHensBinding = ActivityDetailBabyLayingHensBinding.inflate(layoutInflater)
        setContentView(detailBabyLayingHensBinding.root)

        chosenId = intent.getIntExtra("CHOSENID", 0)
        getData()
    }

    private fun getData() {
        val dataBabyBroiler = Data.generateBabyLayingHens()

        dataBabyBroiler.forEach { data ->
            when (chosenId) {
                data.id -> {
                    detailBabyLayingHensBinding.textView1.text = data.bahan_1
                    detailBabyLayingHensBinding.textView2.text = data.bahan_2
                    detailBabyLayingHensBinding.textView3.text = data.bahan_3
                    detailBabyLayingHensBinding.textView4.text = data.bahan_4
                    detailBabyLayingHensBinding.textView5.text = data.bahan_5
                }
            }
        }
    }
}