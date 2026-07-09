package com.pandasukastrawberry.portalmahasiswa_kelompokpandasukastrawberry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class JadwalSeninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jadwal_senin)

        val btnSelasa = findViewById<Button>(R.id.btnSelasa)
        val btnRabu = findViewById<Button>(R.id.btnRabu)
        val btnKamis = findViewById<Button>(R.id.btnKamis)
        val btnJumat = findViewById<Button>(R.id.btnJumat)
        val lihatSemua = findViewById<TextView>(R.id.txtLihatSemua)
        val btntambahCatatan = findViewById<Button>(R.id.btnTambahCatatan)

        btntambahCatatan.setOnClickListener {
            startActivity(
                Intent(this, CatatanPengingatActivity::class.java)
            )
        }

        lihatSemua.setOnClickListener {
            startActivity(
                Intent(this, JadwalUjianActivity::class.java)
            )
        }

        btnSelasa.setOnClickListener {
            startActivity(Intent(this, JadwalSelasaActivity::class.java))
            finish()
        }
        btnRabu.setOnClickListener {
            startActivity(Intent(this, JadwalRabuActivity::class.java))
            finish()
        }
        btnKamis.setOnClickListener {
            startActivity(Intent(this, JadwalKamisActivity::class.java))
            finish()
        }
        btnJumat.setOnClickListener {
            startActivity(Intent(this, JadwalJumatActivity::class.java))
            finish()
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.selectedItemId = R.id.menu_jadwal

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_dashboard -> {
                    startActivity(Intent(this, DashboardActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                R.id.menu_jadwal -> true
                R.id.menu_nilai -> {
                    startActivity(Intent(this, NilaiActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
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