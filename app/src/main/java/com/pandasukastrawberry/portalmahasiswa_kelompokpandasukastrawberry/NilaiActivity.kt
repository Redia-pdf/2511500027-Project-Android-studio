package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class NilaiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nilai)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.menu_nilai

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
                R.id.menu_nilai -> true
                R.id.menu_profil -> {
                    startActivity(Intent(this, ProfilActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}