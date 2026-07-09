package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CatatanPengingatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.catatan_pengingat)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)
        val btnBatal = findViewById<Button>(R.id.btnBatal)

        btnBack.setOnClickListener {
            finish()
        }

        btnBatal.setOnClickListener {
            Toast.makeText(this,"Penambahan catatan dibatalkan",Toast.LENGTH_SHORT).show()
            finish()
        }

        btnSimpan.setOnClickListener {
            Toast.makeText(this,"Catatan berhasil disimpan",Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}