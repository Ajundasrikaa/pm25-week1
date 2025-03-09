package com.example.android1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edHai : EditText = findViewById(R.id.edHai)
        val btnHai : Button = findViewById(R.id.btnHai)
        val tvHai : TextView = findViewById(R.id.tvHai)

        btnHai.setOnClickListener {
            var str : String = edHai.text.toString()
            tvHai.setText("Hallo, $str")

        }
    }
}