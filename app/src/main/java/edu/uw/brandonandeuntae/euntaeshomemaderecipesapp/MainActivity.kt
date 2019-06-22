package edu.uw.brandonandeuntae.euntaeshomemaderecipesapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var helloWorld1: TextView
    private lateinit var nextActivity1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloWorld1 = findViewById(R.id.HelloWorld1)
        nextActivity1 = findViewById(R.id.testButton1)
        helloWorld1.text = "Hi Euntae"

        nextActivity1.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java).apply {
                putExtra("EUNTAE", "FROM MAIN ACTIVITY")
            }
            startActivity(intent)
        }

        Log.d("Main1", "Hi Euntae has been printed")
        Toast.makeText(this@MainActivity, "Hello World", Toast.LENGTH_SHORT).show()
    }


    override fun onStart() {
        super.onStart()
        Log.d("Main1", "Main1 Started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main1", "Main1 Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main1", "Main1 Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main1", "Main1 Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main1", "Main1 Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main1", "Main1 Destroyed")
    }
}
