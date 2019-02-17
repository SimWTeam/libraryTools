package com.simplewen.win0.wd.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter

/**重写viewPge中的Fragment**/
class ViewPageAdapter(fm: FragmentManager, fg_list:ArrayList<Fragment>): FragmentStatePagerAdapter(fm){
    private var listFg = arrayListOf<Fragment>()
    init {
        listFg = fg_list
    }
    override fun getCount(): Int {
        return listFg.size
    }
    override fun getItem(position: Int): Fragment {
        return listFg[position]
    }

    override fun getItemPosition(`object`: Any): Int {
        return PagerAdapter.POSITION_NONE
    }


}