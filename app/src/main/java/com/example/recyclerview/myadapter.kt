package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class myadapter(private  val data: ArrayList<create_first_class>) :RecyclerView.Adapter<myadapter.MyviewHolder>() {
    class MyviewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val profile= itemView.findViewById<CircleImageView>(R.id.profile_image)
        val name= itemView.findViewById<TextView>(R.id.name)
        val number= itemView.findViewById<TextView>(R.id.number)

    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
         val myitem = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return MyviewHolder(myitem)
     }

     override fun getItemCount(): Int {
       return data.size

     }

     override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
      val singleData= data[position]
         holder.name.text = singleData.name
         holder.number.text = singleData.number
          Glide.with(holder.profile.context).load(singleData.profile).into(holder.profile)
     }
 }