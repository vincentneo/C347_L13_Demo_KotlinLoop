package sg.edu.rp.c347.id19007966.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            for (i in 1..5) {
                Log.d("MainActivity", i.toString())
            }
        }
        button2.setOnClickListener {
            val word = editTextWord.text.toString()
            for (character in word) {
                Log.d("MainActivity", "$character")
            }
        }
    }

}