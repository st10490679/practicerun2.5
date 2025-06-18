package za.ac.iie.icetask4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

     val artPoints = findViewById<EditText>(R.id.artPoints)
     val bobPoints = findViewById<EditText>(R.id.bobPoints)
     val calPoints = findViewById<EditText>(R.id.calPoints)
     val danPoints = findViewById<EditText>(R.id.danPoints)
     val eliPoints = findViewById<EditText>(R.id.eliPoints)
     val btnsubmit = findViewById<Button>(R.id.btnsubmit)
     val txtresults = findViewById<TextView>(R.id.txtresults)


     btnsubmit.setOnClickListener {
         val artScore = artPoints.text.toString().toInt() ?: 0
         val bobScore = bobPoints.text.toString().toInt() ?: 0
         val calScore = calPoints.text.toString().toInt() ?:0
         val danScore = danPoints.text.toString().toInt() ?:0
         val eliScore = eliPoints.text.toString().toInt() ?:0

         val output = StringBuilder()
         output.append("Point for Game?")
         output.append("Art" + "*".repeat(artScore) + "\n")
         output.append("Bob" + "*".repeat(bobScore)+ "\n")
         output.append("Cal"+ "*".repeat(calScore)+ "\n")
         output.append("Dan" + "*".repeat(danScore) +"\n")
         output.append("Eli" + "*".repeat(eliScore) +"\n")

     txtresults.text = output.toString()


     }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}