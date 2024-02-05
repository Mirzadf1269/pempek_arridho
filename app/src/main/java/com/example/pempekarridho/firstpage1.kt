package com.example.pempekarridho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class firstpage1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage1)

        val btnClick = findViewById<Button>(R.id.myButton2)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.myButton2 -> {
                val hiIntent = Intent(this, firstpage2::class.java)
                startActivity(hiIntent)
            }
        }
    }
}