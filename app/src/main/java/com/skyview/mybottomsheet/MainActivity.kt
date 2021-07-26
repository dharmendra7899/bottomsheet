package com.skyview.mybottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btn)

        button.setOnClickListener {
            val bottomSheet = BottomSheet(this)
            bottomSheet.showBottomSheet()
        }
    }
}