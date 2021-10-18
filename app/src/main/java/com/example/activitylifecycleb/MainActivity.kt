package com.example.activitylifecycleb

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tvStatus:TextView
    var status=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvStatus=findViewById(R.id.tvStatus)

    }

    override fun onResume() {
        super.onResume()
        status = "${tvStatus.text} \n online"
        tvStatus.text =status
    }

    override fun onPause() {
        super.onPause()
        val df= SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date())
        status = "${tvStatus.text} \n Last seen: $df"
        tvStatus.text =status
    }

}