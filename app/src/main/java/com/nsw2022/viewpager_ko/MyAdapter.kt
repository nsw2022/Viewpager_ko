package com.nsw2022.viewpager_ko

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fragmentActivity:FragmentActivity) : FragmentStateAdapter(fragmentActivity){

    var fragments = arrayOfNulls<Fragment>(3)

    init {
        fragments[0] = Page1Fragment()
        fragments[1] = Page2Fragment()
        fragments[2] = Page3Fragment()
    }



    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]!!

}