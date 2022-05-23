package com.example.whatsapp_clone.Home_Screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.whatsapp_clone.Controller.Fragment_Adapter
import com.example.whatsapp_clone.R
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var tab_view: TabLayout
    lateinit var view_pager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()
        tab_view.addTab(tab_view.newTab().setText("Chats"))
        tab_view.addTab(tab_view.newTab().setText("Status"))
        tab_view.addTab(tab_view.newTab().setText("Calls"))

        var adapter = Fragment_Adapter(this, supportFragmentManager)
        view_pager.adapter = adapter
        view_pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_view))

        tab_view.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_pager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }

    fun binding() {
        tab_view = findViewById<TabLayout>(R.id.tab_view)
        view_pager = findViewById<ViewPager>(R.id.view_pager)
    }
}