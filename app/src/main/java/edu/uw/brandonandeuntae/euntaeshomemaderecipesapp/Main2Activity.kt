package edu.uw.brandonandeuntae.euntaeshomemaderecipesapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {


    private lateinit var helloWorld2: TextView
    private lateinit var nextActivity2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        helloWorld2 = findViewById(R.id.HelloWorld2)
        nextActivity2 = findViewById(R.id.testButton2)
        helloWorld2.text = intent.getStringExtra("EUNTAE")
        nextActivity2.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main2", "Main2 Started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main2", "Main2 Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main2", "Main2 Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main2", "Main2 Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main2", "Main2 Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main2", "Main2 Destroyed")
    }
}
