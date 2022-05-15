package com.quanphan.qqeditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout

class MenuActivity : AppCompatActivity() {

    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

//        //add fragment
//        if (findViewById<FrameLayout>(R.id.frameLayout) != null){
//            val fragmentTransaction = fragmentManager.beginTransaction()
//            fragmentTransaction.add(R.id.frameLayout, CutFragment())
//            fragmentTransaction.commit()
//        }


    }

    fun onClickCut(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, CutFragment())
        fragmentTransaction.commit()
    }
    fun onClickCrop(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, CropFragment())
        fragmentTransaction.commit()
    }

    fun onClickMusic(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, MusicFragment())
        fragmentTransaction.commit()
    }
    fun onClickSticker(view: View) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, StickerFragment())
        fragmentTransaction.commit()
    }

}