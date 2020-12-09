package com.deevrv.assigment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(){

            var inputText1: String?
            var inputText2: String?

            inputText1 = input1.text.toString()
            inputText2 = input2.text.toString()
            val redText = DataClass("$inputText1", "$inputText2")


            val intent = Intent (this, MainActivity2::class.java )
            intent.putExtra("next3", redText)
//            intent.putExtra("next1", "$inputText1")
//            intent.putExtra("next2", "$inputText2")
            startActivity(intent)
        }
        val myText3 = intent.extras?.getString ("textNew3") ?: return
        val getText4 = intent.extras?.getString("textNew4")?: return

        text3.text = " Вновь передано: $myText3"
        text4.text = " Вновь передано: $getText4"

    }
}


