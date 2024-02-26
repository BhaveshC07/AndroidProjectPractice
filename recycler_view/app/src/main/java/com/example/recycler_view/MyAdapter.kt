package com.example.recycler_view

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var newsArrayList:ArrayList<News>,var context:Activity):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem=newsArrayList[position]
        holder.hTitle.text=currentItem.newsHeading
        holder.hImage.setImageResource(currentItem.newsImage)

    }

    override fun getItemCount(): Int {
        return newsArrayList.size
    }
    //it holds the view so views are not created every time so memory can be save
    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val hTitle =itemView.findViewById<TextView>(R.id.headingtitle)
        var hImage =itemView.findViewById<ShapeableImageView>(R.id.headingimg)
    }
}