package com.example.an10_onl.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.an10_onl.R
import com.example.an10_onl.ui.appInfo.FirstStartFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, FirstStartFragment())
            .commit()

    }
}