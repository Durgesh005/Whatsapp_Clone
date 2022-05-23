package com.example.whatsapp_clone.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp_clone.Controller.Calls_Adapter
import com.example.whatsapp_clone.R


class Calls_Fragment : Fragment() {

    lateinit var calls_views: RecyclerView
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
        "Rupesh Rnws"
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_calls_, container, false)
        calls_views = view.findViewById<RecyclerView>(R.id.calls_view)

        var adapter1 = Calls_Adapter(activity, data, photo)
        var layoutManager1 = LinearLayoutManager(activity)
        calls_views.layoutManager = layoutManager1
        calls_views.adapter = adapter1
        return view
    }


}