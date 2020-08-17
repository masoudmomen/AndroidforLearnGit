package com.example.firstprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "hello masoud", Toast.LENGTH_SHORT).show()
    }

    // add new line
    // add another line
    // add line 3
}