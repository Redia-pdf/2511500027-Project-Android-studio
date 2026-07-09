package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotifikasiSemuaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notifikasi_semua)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val txtUnread = findViewById<TextView>(R.id.txtUnread)

        btnBack.setOnClickListener {
            finish()
        }

        txtUnread.setOnClickListener {
            startActivity(
                Intent(this, NotifikasiUnreadActivity::class.java)
            )
        }

    }
}