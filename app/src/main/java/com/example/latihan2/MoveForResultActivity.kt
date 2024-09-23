package com.example.latihan2

import android.os.Bundle
import android.service.chooser.ChooserAction
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private lateinit var btnChoose:Button
private lateinit var rgNumber: RadioGroup

class MoveForResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_move_for_result)
        btnChoose=findViewById(R.id.btn_choose)
        rgNumber=findViewById(R.id.rg_number)

        btnChoose.setOnClickListener(this)
        }

    }

