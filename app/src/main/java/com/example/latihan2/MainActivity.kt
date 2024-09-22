package com.example.latihan2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.sql.RowId

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Button Activity
        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
//Button Move Activity With data
        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)
//Button move activity with object
        val btnMoveWithObject:Button = findViewById(R.id.btn_move_activity_object)
        btnMoveWithObject.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, page2::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data -> {
                val moveIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Mamank Racing")
                moveIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 25)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_object ->{
                val person =Person(
                    "MAMANK RACING",
                    5,
                    "ABACOT.@gmail.com",
                    "lampung"
                )
// Parcelable Class Person
                val moveWithObjectintent = Intent(this@MainActivity,MoveWithObjectActivity::class.java)
                moveWithObjectintent.putExtra(MoveWithObjectActivity.EXTRA_PERSON,person)
                startActivity(moveWithObjectintent)        
            }
        }
    }
}

