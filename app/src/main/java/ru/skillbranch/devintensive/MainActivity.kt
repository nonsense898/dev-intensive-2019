package ru.skillbranch.devintensive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list:MutableList<String> = mutableListOf()
        list.add("dede")
        list.add("3d3ee")
        list.add("9r0kf")

        for (i in list){
            Toast.makeText(this,i , Toast.LENGTH_SHORT).show()
        }
    }
}