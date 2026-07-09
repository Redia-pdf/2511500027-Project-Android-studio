package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var edtConfirmPassword: EditText

    private lateinit var btnSignUp: Button
    private lateinit var layoutSignIn: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Inisialisasi View
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword)

        btnSignUp = findViewById(R.id.btnSignUp)
        layoutSignIn = findViewById(R.id.layoutSignIn)

        // ==========================
        // Tombol SIGN UP
        // ==========================
        btnSignUp.setOnClickListener {

            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()
            val confirmPassword = edtConfirmPassword.text.toString().trim()

            if (email.isEmpty()) {
                edtEmail.error = "Email harus diisi"
                edtEmail.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                edtPassword.error = "Password harus diisi"
                edtPassword.requestFocus()
                return@setOnClickListener
            }

            if (confirmPassword.isEmpty()) {
                edtConfirmPassword.error = "Konfirmasi password harus diisi"
                edtConfirmPassword.requestFocus()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(
                    this,
                    "Password dan Konfirmasi Password tidak sama",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            Toast.makeText(
                this,
                "Registrasi Berhasil",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        // ==========================
        // Tab SIGN IN
        // ==========================
        layoutSignIn.setOnClickListener {

            startActivity(Intent(this, LoginActivity::class.java))
            finish()

        }
    }
}