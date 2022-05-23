package com.example.whatsapp_clone.Controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.example.whatsapp_clone.Fragment.Calls_Fragment
import com.example.whatsapp_clone.Fragment.Chat_Fragment
import com.example.whatsapp_clone.Fragment.Status_Fragment
import com.example.whatsapp_clone.Home_Screen.MainActivity

class Fragment_Adapter(mainActivity: MainActivity, supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> Chat_Fragment()
            1 -> Status_Fragment()
            else -> Calls_Fragment()
        }

    }
}