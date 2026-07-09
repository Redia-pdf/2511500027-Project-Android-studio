package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class PengaturanActivity : AppCompatActivity() {

    private lateinit var btnBack: ImageView
    private lateinit var layoutLogout: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pengaturan)

        btnBack = findViewById(R.id.btnBack)
        layoutLogout = findViewById(R.id.layoutLogout)

        // Tombol kembali ke Profil
        btnBack.setOnClickListener {
            finish()
        }

        // Tombol Keluar
        layoutLogout.setOnClickListener {
            showLogoutDialog()
        }
    }

    private fun showLogoutDialog() {

        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_logout)

        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        dialog.setCancelable(false)

        val btnYa = dialog.findViewById<Button>(R.id.btnYa)
        val btnTidak = dialog.findViewById<Button>(R.id.btnTidak)

        btnTidak.setOnClickListener {
            dialog.dismiss()
        }

        btnYa.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            intent.flags =
                Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            startActivity(intent)
            finish()

        }

        dialog.show()
    }
}