package com.tiodwisatrio.apb_pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //  Ambil ID komponen btn (btn_ulang_tahun)
        val getButtonID : Button = findViewById(R.id.btn_ulang_tahun)

    //  Berikan aksi (event) pada button => setOnClickListener
        getButtonID.setOnClickListener() {
            showSayUltah()
        }
    }

    private fun showSayUltah() {
        val message = getString(R.string.ucapan)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}