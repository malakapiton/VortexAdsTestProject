package com.example.vortexadstestproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vortexadstestproject.R

const val SECOND_FRAGMENT_TAG = "second_fragment_tag"

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.second_fragment, container, false)

        val secondFragmentTextView = view.findViewById<TextView>(R.id.tv_second_fragment)
        secondFragmentTextView.setOnClickListener {
            val fm = fragmentManager?.beginTransaction()
            fm?.replace(R.id.fragment_container, FirstFragment())
            fm?.addToBackStack(null)
            fm?.commit()
        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val bundle = Bundle()
        bundle.putString("fragment_tag", SECOND_FRAGMENT_TAG)
    }
}