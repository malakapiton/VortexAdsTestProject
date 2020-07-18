package com.example.vortexadstestproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vortexadstestproject.R
import com.example.vortexadstestproject.fragment.DreamFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            setInitialFragment()
        } else {
            val fragment = supportFragmentManager.findFragmentByTag(savedInstanceState.getString("fragment_tag"))

            supportFragmentManager.beginTransaction().apply {
                if (fragment != null) {
                    replace(R.id.fragment_container, fragment)
                }
                addToBackStack(null)
                commit()
            }
        }
    }

    private fun setInitialFragment() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, DreamFragment())
            addToBackStack(null)
            commit()
        }
    }
}
