package com.example.checkrv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

class Main2Fragment3 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main23, container, false)

        view.findViewById<ImageView>(R.id.oneBtn).setOnClickListener{
            it.findNavController().navigate(R.id.action_main2Fragment3_to_main2Fragment1)
        }
        view.findViewById<ImageView>(R.id.twoBtn).setOnClickListener{
            it.findNavController().navigate(R.id.action_main2Fragment3_to_main2Fragment2)
        }

        return view
    }


}