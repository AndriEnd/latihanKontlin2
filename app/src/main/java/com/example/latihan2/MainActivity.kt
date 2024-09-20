package com.example.latihan2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_more_activity)
        btnMoveActivity.setOnClickListener {
            val moveIntent = Intent(this@MainActivity, page2::class.java)
            startActivity(moveIntent)
        }
    }
}


    fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_more_activity -> {
            }
        }
    }

private fun Button.setOnClickListener(mainActivity: MainActivity) {
    TODO("Not yet implemented")
}
