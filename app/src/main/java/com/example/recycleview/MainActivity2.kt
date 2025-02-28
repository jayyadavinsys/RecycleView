package com.example.recycleview

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val img= intent.getIntExtra("Img", 0)
        val name=intent.getStringExtra("Name")
        val num=intent.getStringExtra("Num")

        Toast.makeText(this,"$img, name $name, number $num", Toast.LENGTH_LONG).show()
      val imgView:ImageView= findViewById(R.id.img_1)
            imgView.setImageResource(img)
        val nameText:TextView=findViewById(R.id.name)
        nameText.text = name
        val numText: TextView=findViewById(R.id.num)
        numText.text = num

    }
}