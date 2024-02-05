package com.example.pempekarridho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnClick: Button = findViewById(R.id.myButton)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v !=null) {
            when(v.id){
                R.id.myButton -> {
                    val pindahIntent = Intent(this, LoginPageActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}