package com.example.checkrv

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController


class Main2Fragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_main21, container, false)

        val starttodaystimer = view.findViewById<ImageView>(R.id.challengeImg)
        starttodaystimer.setOnClickListener{
            val intent = Intent(getActivity(), TodaysFiveActivity::class.java)
            startActivity(intent)}


        view.findViewById<ImageView>(R.id.twoBtn).setOnClickListener{
            it.findNavController().navigate(R.id.action_main2Fragment1_to_main2Fragment2)
        }
        view.findViewById<ImageView>(R.id.threeBtn).setOnClickListener{
            it.findNavController().navigate(R.id.action_main2Fragment1_to_main2Fragment3)
        }

        return view
    }


}