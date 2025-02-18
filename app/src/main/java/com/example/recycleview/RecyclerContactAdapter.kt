package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerContactAdapter(var context: Context, var list:ArrayList<ContactModel>) : RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgId: ImageView = itemView.findViewById(R.id.img_img)
        val nameId: TextView = itemView.findViewById(R.id.textName)
        val numId: TextView = itemView.findViewById(R.id.textNo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

       var v= LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false)
        var viewHolder= ViewHolder(v)
        return  viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgId.setImageResource(list.get(position).img)
        holder.nameId.setText(list.get(position).name)
        holder.numId.setText(list.get(position).number)
    }

    override fun getItemCount(): Int {
       return list.size
    }


}