package com.example.whatsapp_clone.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp_clone.Controller.Calls_Adapter.*
import com.example.whatsapp_clone.R
import de.hdodenhof.circleimageview.CircleImageView

class Calls_Adapter(
    val activity: FragmentActivity?,
    val data: Array<String>,
    val photo: Array<Int>
) : RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(activity).inflate(R.layout.item_2, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txt_item.text = data[position]
        holder.images.setImageResource(photo[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txt_item = itemView.findViewById<TextView>(R.id.name_txt)
        val images = itemView.findViewById<CircleImageView>(R.id.profile_img_btn)
        val messages = itemView.findViewById<TextView>(R.id.message_txt)

    }
}