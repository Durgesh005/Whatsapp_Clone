package com.example.whatsapp_clone.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp_clone.Fragment.Chat_Fragment
import com.example.whatsapp_clone.Modal_Data.ItemsViewModel
import com.example.whatsapp_clone.R
import de.hdodenhof.circleimageview.CircleImageView

class Chats_Adapter(
    val chatFragment: FragmentActivity?,
    val data: Array<String>,
    val photo: Array<Int>,
    val messages: Array<String>
) :
    RecyclerView.Adapter<Chats_Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Chats_Adapter.ViewHolder {
        val view = LayoutInflater.from(chatFragment).inflate(R.layout.item_1, parent, false)


        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Chats_Adapter.ViewHolder, position: Int) {
        holder.txt_item.text = data[position]
        holder.images.setImageResource(photo[position])
        holder.messages.text = messages[position]


    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val txt_item = itemView.findViewById<TextView>(R.id.name_txt)
        val images = itemView.findViewById<CircleImageView>(R.id.profile_img_btn)
        val messages = itemView.findViewById<TextView>(R.id.message_txt)
    }

}