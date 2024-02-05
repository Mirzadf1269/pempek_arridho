package com.example.pempekarridho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class firstpage2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage2)

        val btnClick = findViewById<Button>(R.id.fpButton2)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.fpButton2 -> {
                val heIntent = Intent(this, BerandaActivity::class.java)
                startActivity(heIntent)
            }
        }
    }
}