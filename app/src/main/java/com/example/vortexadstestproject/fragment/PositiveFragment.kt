package com.example.vortexadstestproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vortexadstestproject.R

const val POSITIVE_FRAGMENT_TAG = "positive_fragment_tag"

class PositiveFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.positive_fragment, container, false)

        val positiveFragmentTextView = view.findViewById<TextView>(R.id.tv_positive_fragment)
        positiveFragmentTextView.setOnClickListener {
            val fm = fragmentManager?.beginTransaction()
            fm?.replace(R.id.fragment_container, DreamFragment())
            fm?.addToBackStack(null)
            fm?.commit()
        }
        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val bundle = Bundle()
        bundle.putString("fragment_tag", POSITIVE_FRAGMENT_TAG)
    }
}