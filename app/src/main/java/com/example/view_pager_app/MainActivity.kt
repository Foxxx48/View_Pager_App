package com.example.view_pager_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.view_pager_app.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding?.slider?.adapter = MoviesAdapter(this)

        val tabLayoutMediator = binding?.tabSlider?.let {
            binding?.slider?.let { it1 ->
                TabLayoutMediator(it,
                    it1,
                    TabLayoutMediator.TabConfigurationStrategy { tab, position -> when (position) {
                        0 -> {
                            tab.setIcon(R.drawable.play)
                            tab.text = getString(R.string.dune)
                        }
                        1 -> {
                            tab.setIcon(R.drawable.play)
                            tab.text = getString(R.string.dark_knight)
                        }
                        2 -> {
                            tab.setIcon(R.drawable.play)
                            tab.text = getString(R.string.do_not_look_up)
                        }
                        3 -> {
                            tab.setIcon(R.drawable.play)
                            tab.text = getString(R.string.true_detective)
                        }
                    }

                    })
            }
        }
        tabLayoutMediator?.attach()

    }

}