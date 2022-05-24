package com.example.whatsapp_clone.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp_clone.Controller.Status_Adapter
import com.example.whatsapp_clone.R


class Status_Fragment : Fragment() {

    lateinit var status_view: RecyclerView
    var data = arrayOf(
        "Pradyuman",
        "Deep Mehta",
        "Zenish",
        "Kartik",
        "Abhishek N",
        "Sumedh Bhai",
        "Jignesh (Office)",
        "Arif S",
        "Abhishek N"

    )
    var photo = arrayOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4,
        R.drawable.photo2,
        R.drawable.photo4,
        R.drawable.photo2,
        R.drawable.photo4,
        R.drawable.photo1


    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_status_, container, false)
        status_view = view.findViewById<RecyclerView>(R.id.status_view)

        var adapter1 = Status_Adapter(activity, data, photo)
        var layoutManager1 = LinearLayoutManager(activity)
        status_view.layoutManager = layoutManager1
        status_view.adapter = adapter1
        return view

    }


}