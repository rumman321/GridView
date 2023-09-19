package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.view.menu.ListMenuItemView

class Adapter(context:Context,courseList:ArrayList<Model>):ArrayAdapter<Model?>(context,0,courseList as List<Model>) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView=convertView
        if (listItemView==null){
            listItemView=LayoutInflater.from(context).inflate(R.layout.custom_lay,parent,false)

        }
        val courseModel:Model?=getItem(position)
        var coursename =listItemView!!.findViewById<TextView>(R.id.textView)
        val courseimage=listItemView!!.findViewById<ImageView>(R.id.imageView)

        coursename.setText(courseModel!!.getCourse_name())
        courseimage.setImageResource(courseModel!!.getCourse_img())

        return listItemView
    }
}