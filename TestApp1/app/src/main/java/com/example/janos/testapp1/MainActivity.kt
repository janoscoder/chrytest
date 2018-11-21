package com.example.janos.testapp1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

import com.example.janos.testapp1.SettingsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onBtnActChoice(view: View){
        val myToast = Toast.makeText(this,"T'as clic!", Toast.LENGTH_SHORT)
        myToast.show()
        startActivity(Intent(this, SettingsActivity::class.java))
    }
}
