package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.widget.TextView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {
    lateinit var btnSelengkapnyaJadwal: TextView
    lateinit var btnSelengkapnyaNilai: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dasboard)

        btnSelengkapnyaJadwal = findViewById(R.id.btnSelengkapnyaJadwal)
        btnSelengkapnyaNilai = findViewById(R.id.btnSelengkapnyaNilai)

        btnSelengkapnyaJadwal.setOnClickListener {
            startActivity(
                Intent(this, JadwalSelasaActivity::class.java)
            )
        }

        btnSelengkapnyaNilai.setOnClickListener {
            startActivity(
                Intent(this, NilaiActivity::class.java)
            )
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        // halaman yang sedang aktif
        bottomNav.selectedItemId = R.id.menu_dashboard

        bottomNav.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.menu_dashboard -> {
                    true
                }

                R.id.menu_jadwal -> {
                    startActivity(Intent(this, JadwalSeninActivity::class.java))
                    overridePendingTransition(0,0)
                    finish()
                    true
                }

                R.id.menu_nilai -> {
                    startActivity(Intent(this, NilaiActivity::class.java))
                    overridePendingTransition(0,0)
                    finish()
                    true
                }

                R.id.menu_profil -> {
                    startActivity(Intent(this, ProfilActivity::class.java))
                    overridePendingTransition(0,0)
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}