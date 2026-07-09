package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotifikasiUnreadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notifikasi_unread)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val txtSemua = findViewById<TextView>(R.id.txtSemua)

        btnBack.setOnClickListener {
            finish()
        }

        txtSemua.setOnClickListener {
            finish()
        }

    }
}