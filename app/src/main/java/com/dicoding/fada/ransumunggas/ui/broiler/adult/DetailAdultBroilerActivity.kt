package com.dicoding.fada.ransumunggas.ui.broiler.adult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.fada.ransumunggas.databinding.ActivityDetailAdultBroilerBinding
import com.dicoding.fada.ransumunggas.data.Data

class DetailAdultBroilerActivity : AppCompatActivity() {
    private lateinit var detailAdultBroilerBinding: ActivityDetailAdultBroilerBinding
    private var chosenId: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailAdultBroilerBinding = ActivityDetailAdultBroilerBinding.inflate(layoutInflater)
        setContentView(detailAdultBroilerBinding.root)

        chosenId = intent.getIntExtra("CHOSENID", 0)
        getData()
    }

    private fun getData() {
        val dataBabyBroiler = Data.generateAdultBroiler()

        dataBabyBroiler.forEach { data ->
            when (chosenId) {
                data.id -> {
                    detailAdultBroilerBinding.textView1.text = data.bahan_1
                    detailAdultBroilerBinding.textView2.text = data.bahan_2
                    detailAdultBroilerBinding.textView3.text = data.bahan_3
                    detailAdultBroilerBinding.textView4.text = data.bahan_4
                    detailAdultBroilerBinding.textView5.text = data.bahan_5
                }
            }
        }
    }
}