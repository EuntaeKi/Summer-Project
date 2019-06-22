package edu.uw.brandonandeuntae.euntaeshomemaderecipesapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var  searchBar: android.support.v7.widget.Toolbar
    private lateinit var settingButton: ImageView
    private lateinit var bookmarkImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchBar = findViewById(R.id.searchBar)
        settingButton = findViewById(R.id.settingButton)
        bookmarkImage = findViewById(R.id.savedRecipeMark)
        settingButton.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java).apply {
                putExtra("EUNTAE", "FROM MAIN ACTIVITY")
            }
            startActivity(intent)
        }
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
