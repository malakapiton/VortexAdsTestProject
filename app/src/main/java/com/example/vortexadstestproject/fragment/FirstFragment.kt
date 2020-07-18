package com.example.vortexadstestproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vortexadstestproject.R

const val FIRST_FRAGMENT_TAG = "first_fragment_tag"

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_fragment, container, false)

        val firstFragmentTextView = view.findViewById<TextView>(R.id.tv_first_fragment)
        firstFragmentTextView.setOnClickListener {
            val fm = fragmentManager?.beginTransaction()
            fm?.replace(R.id.fragment_container, SecondFragment())
            fm?.addToBackStack(null)
            fm?.commit()
        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val bundle = Bundle()
        bundle.putString("fragment_tag", FIRST_FRAGMENT_TAG)
    }
}
