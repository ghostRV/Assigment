package com.deevrv.assigment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.lang.reflect.Array.set
import java.nio.file.Paths.get

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val redText = intent.extras?.getSerializable("next3") as DataClass




        get1.setText(redText.text5)
        get2.setText(redText.text6)





        val a: String? = get1.text.toString()
        val b: String? = get2.text.toString()



        button2.setOnClickListener(){
            val intent = Intent (this, MainActivity::class.java)
            intent.putExtra("textNew3", "$a")
            intent.putExtra("textNew4", "$b")
            startActivity(intent)
        }



    }
}