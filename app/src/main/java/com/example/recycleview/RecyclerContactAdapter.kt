package com.example.recycleview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerContactAdapter(private var context: Context, private var list:ArrayList<ContactModel>, private  val listener: onClickListener) : RecyclerView.Adapter<RecyclerContactAdapter.MyViewHolder>(), onClickListener {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

       val v= LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false)
        val viewHolder= MyViewHolder(v)
        Log.d("onCreateViewHolder", "call aonCreateVieHolder")
        return  viewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgId.setImageResource(list[position].img)
        holder.nameId.text = list[position].name
        holder.numId.text = list[position].number

    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onItemClick(position: Int) {
        TODO("Not yet implemented")
    }

   inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgId: ImageView = itemView.findViewById(R.id.img_img)
        val nameId: TextView = itemView.findViewById(R.id.textName)
        val numId: TextView = itemView.findViewById(R.id.textNo)
        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(position)
                }
            }
        }
    }



}