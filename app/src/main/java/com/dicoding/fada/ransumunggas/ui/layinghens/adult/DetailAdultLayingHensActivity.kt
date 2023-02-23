package com.dicoding.fada.ransumunggas.ui.layinghens.adult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.fada.ransumunggas.databinding.ActivityDetailAdultLayingHensBinding
import com.dicoding.fada.ransumunggas.data.Data

class DetailAdultLayingHensActivity : AppCompatActivity() {
    private lateinit var detailAdultLayingHensBinding: ActivityDetailAdultLayingHensBinding
    private var chosenId: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailAdultLayingHensBinding = ActivityDetailAdultLayingHensBinding.inflate(layoutInflater)
        setContentView(detailAdultLayingHensBinding.root)

        chosenId = intent.getIntExtra("CHOSENID", 0)
        getData()
    }

    private fun getData() {
        val dataBabyBroiler = Data.generateAdultLayingHens()

        dataBabyBroiler.forEach { data ->
            when (chosenId) {
                data.id -> {
                    detailAdultLayingHensBinding.textView1.text = data.bahan_1
                    detailAdultLayingHensBinding.textView2.text = data.bahan_2
                    detailAdultLayingHensBinding.textView3.text = data.bahan_3
                    detailAdultLayingHensBinding.textView4.text = data.bahan_4
                    detailAdultLayingHensBinding.textView5.text = data.bahan_5
                }
            }
        }
    }
}