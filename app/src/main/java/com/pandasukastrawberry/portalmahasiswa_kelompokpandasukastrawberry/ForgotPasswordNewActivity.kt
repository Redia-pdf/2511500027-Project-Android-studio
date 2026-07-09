package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordNewActivity : AppCompatActivity() {

    private lateinit var edtPassword: EditText
    private lateinit var edtConfirmPassword: EditText
    private lateinit var btnResetPassword: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password_new)

        edtPassword = findViewById(R.id.edtPassword)
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword)
        btnResetPassword = findViewById(R.id.btnResetPassword)

        btnResetPassword.setOnClickListener {

            val password = edtPassword.text.toString().trim()
            val confirm = edtConfirmPassword.text.toString().trim()

            if(password.isEmpty()){
                edtPassword.error = "Masukkan Password"
                return@setOnClickListener
            }

            if(confirm.isEmpty()){
                edtConfirmPassword.error = "Konfirmasi Password"
                return@setOnClickListener
            }

            if(password != confirm){
                Toast.makeText(
                    this,
                    "Password tidak sama",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            Toast.makeText(
                this,
                "Password berhasil diubah",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(this, LoginActivity::class.java)
            )

            finishAffinity()

        }

    }
}