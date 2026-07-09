package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordVerifikasiActivity : AppCompatActivity() {

    private lateinit var btnVerification: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password_verifikasi)

        btnVerification = findViewById(R.id.btnVerification)

        btnVerification.setOnClickListener {

            startActivity(
                Intent(this, ForgotPasswordNewActivity::class.java)
            )

        }

    }
}