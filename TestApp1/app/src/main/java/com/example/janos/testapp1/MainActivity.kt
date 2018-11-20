package com.example.janos.testapp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onBtnActChoice(view: View){
        val myToast = Toast.makeText(this,"T'as clic!", Toast.LENGTH_SHORT)
        myToast.show()
    }
}
