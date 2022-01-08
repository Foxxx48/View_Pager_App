package com.example.view_pager_app

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MoviesAdapter (fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                Dune()
            }
            1 -> {
                DarkKnight()
            }
            2 -> {
                DoNotLookUp()
            }
            3 -> {
                TrueDetective()
            }
            else -> {
                Dune()
            }
        }
    }
}