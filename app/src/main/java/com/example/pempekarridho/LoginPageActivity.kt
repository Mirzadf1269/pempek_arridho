package com.example.pempekarridho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginPageActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val btnClick = findViewById<Button>(R.id.myButton1)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.myButton1 -> {
                val hiIntent = Intent(this, SelamatActivity::class.java)
                startActivity(hiIntent)
            }
        }
    }
}