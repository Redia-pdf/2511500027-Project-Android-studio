package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.app.Dialog
import android.widget.Button


class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil)

        val layoutKeluar = findViewById<LinearLayout>(R.id.layoutKeluar)

        layoutKeluar.setOnClickListener {

            val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_logout)

            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            val btnYa = dialog.findViewById<Button>(R.id.btnYa)
            val btnTidak = dialog.findViewById<Button>(R.id.btnTidak)

            btnYa.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
                finish()
            }

            btnTidak.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }

        val layoutPengaturan = findViewById<LinearLayout>(R.id.layoutPengaturan)

        layoutPengaturan.setOnClickListener {
            startActivity(Intent(this, PengaturanActivity::class.java))
        }

        val btnNotif = findViewById<ImageView>(R.id.btnNotif)

        btnNotif.setOnClickListener {
            startActivity(
                Intent(this, NotifikasiSemuaActivity::class.java)
            )
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.menu_profil

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_dashboard -> {
                    startActivity(Intent(this, DashboardActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                R.id.menu_jadwal -> {
                    startActivity(Intent(this, JadwalSeninActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                R.id.menu_nilai -> {
                    startActivity(Intent(this, NilaiActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                R.id.menu_profil -> true
                else -> false
            }
        }
    }
}