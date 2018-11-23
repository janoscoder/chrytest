package com.example.janos.testapp1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

import com.example.janos.testapp1.SettingsActivity
import com.example.janos.testapp1.ChoiceActivitySettings

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.my_toolbar))
    }
    fun onBtnActChoice(view: View){
        //val myToast = Toast.makeText(this,"onBtnActChoice", Toast.LENGTH_SHORT)
        //myToast.show()
        startActivity(Intent(this, SettingsActivity::class.java))

    }
    fun onBtnActChoiceSettings(view: View){
        startActivity(Intent(this, ChoiceActivitySettings::class.java))
    }
}
