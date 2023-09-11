package br.edu.ifpi.swipefotos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import br.edu.ifpi.swipefotos.adapter.ViewPagerAdapter
import br.edu.ifpi.swipefotos.fragment.Cr7Fragment
import br.edu.ifpi.swipefotos.fragment.MessiFragment
import br.edu.ifpi.swipefotos.fragment.NeymarFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpager = findViewById<ViewPager2>(R.id.viewpager)

        val fragmentList = listOf(Cr7Fragment(), MessiFragment(), NeymarFragment())

        viewpager.adapter = ViewPagerAdapter(fragmentList, supportFragmentManager, lifecycle )


        val tablayout = findViewById<TabLayout>(R.id.tab)
        val nomesTab = listOf("CR7", "MESSI", "NEYMAR")

        TabLayoutMediator( tablayout, viewpager ){
            tab, position ->
            run {
                tab.text = nomesTab[position]
            }
        }.attach()



    }
}