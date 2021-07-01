package com.example.project1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class frag2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag2, container, false)
    }

    internal fun newInstant() : frag2
    {
        val args = Bundle()
        val frag = frag2()
        frag.arguments = args
        return frag
    }
}