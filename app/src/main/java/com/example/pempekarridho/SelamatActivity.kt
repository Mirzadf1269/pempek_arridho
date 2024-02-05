package com.example.pempekarridho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SelamatActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selamat)

        val btnClick = findViewById<Button>(R.id.myButton4)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.myButton4 -> {
                val hiIntent = Intent(this, firstpage1::class.java)
                startActivity(hiIntent)
            }
        }
    }
}