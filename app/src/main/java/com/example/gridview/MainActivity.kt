package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    private lateinit var grid:GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        grid=findViewById(R.id.gridview)
        val courselist:ArrayList<Model> = ArrayList<Model>()

        courselist.add(Model("kotlin",R.drawable.facebook))
        courselist.add(Model("kotlin",R.drawable.facebook))
        courselist.add(Model("kotlin",R.drawable.facebook))
        courselist.add(Model("kotlin",R.drawable.facebook))

        val adapter = Adapter(this,courselist)
        grid.adapter=adapter
    }
}