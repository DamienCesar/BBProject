package com.dc.brigadebarber

import android.content.Intent
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

        signup.setOnClickListener {
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)

        }

        reservation.setOnClickListener {
            val intent = Intent(this,ReservationActivity::class.java)
            startActivity(intent)
        }

    }
}