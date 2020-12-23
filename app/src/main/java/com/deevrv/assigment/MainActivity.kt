package com.deevrv.assigment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deevrv.assigment.feature.top.ui.SerialMainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .add(R.id.container, SerialMainFragment())
            .commit()

    }
}


