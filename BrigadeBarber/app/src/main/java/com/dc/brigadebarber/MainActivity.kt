package com.dc.brigadebarber

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Date
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val formatted = current.format(formatter)
        val arrayAdapter: ArrayAdapter<*>
        val time = arrayOf(
            formatted
        )

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, time)
        reservationList.adapter = arrayAdapter

        calendarView.setOnDateChangeListener { calendarView, i, i2, i3 ->
            Log.d("TEST","$i3 "+"$i2 "+"$i")
        }





    }
}