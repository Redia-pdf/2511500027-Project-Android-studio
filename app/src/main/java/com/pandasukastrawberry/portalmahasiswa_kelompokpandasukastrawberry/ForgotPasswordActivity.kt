package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var btnSendCode: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password)

        btnSendCode = findViewById(R.id.btnSendCode)

        btnSendCode.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ForgotPasswordVerifikasiActivity::class.java
                )
            )
        }
    }
}