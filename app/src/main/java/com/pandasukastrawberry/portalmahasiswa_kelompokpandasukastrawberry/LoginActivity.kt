package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText

    private lateinit var btnLogin: Button

    private lateinit var txtForgotPassword: TextView
    private lateinit var txtSignUp: TextView
    private lateinit var txtSignUpTab: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)

        btnLogin = findViewById(R.id.btnLogin)

        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtSignUp = findViewById(R.id.txtSignUp)
        txtSignUpTab = findViewById(R.id.txtSignUpTab)

        //-----------------------------------
        // LOGIN
        //-----------------------------------

        // LOGIN
        btnLogin.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }
        btnLogin.setOnClickListener {

            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            if(email.isEmpty()){
                edtEmail.error = "Email harus diisi"
                edtEmail.requestFocus()
                return@setOnClickListener
            }

            if(password.isEmpty()){
                edtPassword.error = "Password harus diisi"
                edtPassword.requestFocus()
                return@setOnClickListener
            }

            Toast.makeText(this,"Login Berhasil",Toast.LENGTH_SHORT).show()

            startActivity(
                Intent(this, DashboardActivity::class.java)
            )

            finish()

        }

        //-----------------------------------
        // SIGN UP
        //-----------------------------------

        txtSignUpTab.setOnClickListener {

            startActivity(
                Intent(this, SignupActivity::class.java)
            )
        }

        txtSignUp.setOnClickListener {

            startActivity(
                Intent(this, SignupActivity::class.java)
            )

        }

        //-----------------------------------
        // FORGOT PASSWORD
        //-----------------------------------

        txtForgotPassword.setOnClickListener {

            startActivity(
                Intent(this, ForgotPasswordActivity::class.java)
            )

        }

    }
}