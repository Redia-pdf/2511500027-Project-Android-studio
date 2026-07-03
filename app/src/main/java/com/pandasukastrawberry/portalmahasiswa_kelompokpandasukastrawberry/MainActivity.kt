package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // TEXTVIEW GRADIENT
        val txtIpk = findViewById<TextView>(R.id.main)

        txtIpk.post {

            val paint = txtIpk.paint

            val width = paint.measureText(txtIpk.text.toString())

            val shader = LinearGradient(
                0f,
                0f,
                width,
                txtIpk.textSize,
                intArrayOf(
                    Color.parseColor("#6A00FF"),
                    Color.parseColor("#E76DFF")
                ),
                null,
                Shader.TileMode.CLAMP
            )

            txtIpk.paint.shader = shader

        }
    }
}