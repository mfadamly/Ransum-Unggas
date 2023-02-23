package com.dicoding.fada.ransumunggas.ui.broiler.adult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import com.dicoding.fada.ransumunggas.R
import com.google.android.material.snackbar.Snackbar

class AdultBroilerActivity : AppCompatActivity() {
    private val selectedItems: ArrayList<String?> = arrayListOf(null, null, null, null, null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adult_broiler)

        val buttonSend = findViewById<Button>(R.id.buttonSend)
        buttonSend.setOnClickListener { view ->
            val indexGroup: ArrayList<Int> = arrayListOf()

            var chosenId = 0

            val countNotNullElement = selectedItems.filterNotNull().size

            selectedItems.forEachIndexed lit@{ index, value ->
                if (value == null) return@lit
                indexGroup.add(index)
            }

            when (indexGroup) {
                arrayListOf(0, 1, 2, 3) -> chosenId = 1
                arrayListOf(0, 2, 3, 4) -> chosenId = 2
                arrayListOf(0, 1, 3, 4) -> chosenId = 3
                arrayListOf(0, 1, 2, 4) -> chosenId = 4
                arrayListOf(1, 2, 3, 4) -> chosenId = 5
                arrayListOf(0, 1, 2, 3, 4) -> chosenId = 6
//                arrayListOf(1, 2, 3) -> chosenId = 7
//                arrayListOf(1, 2, 4) -> chosenId = 8
//                arrayListOf(2, 3, 4) -> chosenId = 9
//                arrayListOf(0, 1, 2, 3) -> chosenId = 10
//                arrayListOf(0, 2, 3, 4) -> chosenId = 11
//                arrayListOf(0, 1, 3, 4) -> chosenId = 12
//                arrayListOf(0, 1, 2, 4) -> chosenId = 13
//                arrayListOf(1, 2, 3, 4) -> chosenId = 14
//                arrayListOf(0, 1, 2, 3, 4) -> chosenId = 15
            }

            if (countNotNullElement >=4) {
                if (chosenId != 0) {
                    val detailAdultBroiler = Intent(this, DetailAdultBroilerActivity::class.java).apply {
                        putExtra("CHOSENID", chosenId)
                    }
                    startActivity(detailAdultBroiler)
                }
            } else {
                Snackbar.make(view, "Pilih Minimal 4 Bahan", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.cbDedak -> checkedStatus(checked, 0, "dedak")
                R.id.cbKedelai -> checkedStatus(checked, 1, "kedelai")
                R.id.cbKelapa -> checkedStatus(checked, 2, "kelapa")
                R.id.cbJagung -> checkedStatus(checked, 3, "jagung")
                R.id.cbTahu -> checkedStatus(checked, 4, "sagu")
            }
        }
    }

    private fun checkedStatus(checked: Boolean, index: Int, value: String) {
        when {
            checked -> {
                selectedItems.removeAt(index)
                selectedItems.add(index, value)
            }
            else -> {
                selectedItems.removeAt(selectedItems.indexOf(value))
                selectedItems.add(index, null)
            }
        }
    }
}