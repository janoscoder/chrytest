package com.example.janos.testapp1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast

import com.example.janos.testapp1.SettingsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.))
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }
    fun onBtnActChoice(view: View){
        val myToast = Toast.makeText(this,"onBtnActChoice", Toast.LENGTH_SHORT)
        //TODO: créer l'activité de choix
        myToast.show()
        //startActivity(Intent(this, SettingsActivity::class.java))

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.btn_settings -> {
                startActivity(Intent(this, SettingsActivity::class.java))
                true
            }
            //R.id.help -> {
            //    showHelp()
            //    true
            //}
            else -> super.onOptionsItemSelected(item)
        }
    }
    }
