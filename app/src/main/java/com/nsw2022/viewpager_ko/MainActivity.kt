package com.nsw2022.viewpager_ko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val pager:ViewPager2 by lazy { findViewById(R.id.pager) }
    lateinit var adapter:MyAdapter
    val tabLayout:TabLayout by lazy { findViewById(R.id.tab_layout) }
    var tabTitle:MutableList<String> = mutableListOf("PAGE1","PAGE2","PAGE3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = MyAdapter(this)
        pager.adapter=adapter

        var tabLayoutMediator=TabLayoutMediator(tabLayout, pager,object :TabLayoutMediator.TabConfigurationStrategy{
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                tab.text=(tabTitle[position])
            }
        })

        tabLayoutMediator.attach()

    }//onCreate
}