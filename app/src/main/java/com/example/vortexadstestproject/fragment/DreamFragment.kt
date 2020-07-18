package com.example.vortexadstestproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vortexadstestproject.R

const val DREAM_FRAGMENT_TAG = "dream_fragment_tag"

class DreamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.dream_fragment, container, false)

        val dreamFragmentTextView = view.findViewById<TextView>(R.id.tv_dream_fragment)
        dreamFragmentTextView.setOnClickListener {
            val fm = fragmentManager?.beginTransaction()
            fm?.replace(R.id.fragment_container, PositiveFragment())
            fm?.addToBackStack(null)
            fm?.commit()
        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val bundle = Bundle()
        bundle.putString("fragment_tag", DREAM_FRAGMENT_TAG)
    }
}
