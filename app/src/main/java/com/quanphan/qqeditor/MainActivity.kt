package com.quanphan.qqeditor

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var context:Context?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newBtn.setOnClickListener {
            val intent =Intent(this, MenuActivity::class.java)
            this.startActivity(intent)
        }

    }
}