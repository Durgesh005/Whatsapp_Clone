package com.example.whatsapp_clone.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp_clone.Controller.Chats_Adapter
import com.example.whatsapp_clone.R

class Chat_Fragment : Fragment() {
    lateinit var chats_view: RecyclerView
    var data = arrayOf(
        "Pradyuman",
        "Deep Mehta",
        "Democratic Party Of Rnw",
        "Zenish",
        "+91 8849941661",
        "Kartik",
        "Abhishek N",
        "Sumedh Bhai",
        "Jignesh (Office)",
        "Arif S",
        "+91 9727352050",
        "Rupesh Rnw"
    )
    var photo = arrayOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4,
        R.drawable.photo2,
        R.drawable.photo4,
        R.drawable.photo5,
        R.drawable.photo2,
        R.drawable.photo4,
        R.drawable.photo5,
        R.drawable.photo2,
        R.drawable.photo1,
        R.drawable.photo5
    )

    var messages = arrayOf(
        "Khabar Toh 6",
        "Ok",
        "Like Karo Follow Karo",
        "Kale Ketla Vage",
        "Hu Nathi Avno",
        "Check Kar Le Bhai",
        "Tickets Avadh Express Me Karna",
        "Id Check Thy Gayu 6",
        "Payment Avi Gayu Sadik Bhai Nu",
        "Hu Bahar Avyo Bhai Call Karu",
        "Mail Check Kar",
        "Ave IOS Complete Thy Gayu 6 "
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_chat_, container, false)

        chats_view = view.findViewById<RecyclerView>(R.id.chats_view)

        var adapter1 = Chats_Adapter(activity, data, photo, messages)
        var layoutManager1 = LinearLayoutManager(activity)
        chats_view.layoutManager = layoutManager1
        chats_view.adapter = adapter1


        return view
    }


}

