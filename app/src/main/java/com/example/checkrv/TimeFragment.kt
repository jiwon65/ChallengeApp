package com.example.checkrv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TimeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val timeview = inflater.inflate(R.layout.fragment_time, container, false)

        val items = mutableListOf<String>()

        items.add("플랭크")
        items.add("할로우 포지션")
        items.add("사이드 플랭크")
        items.add("RKC 플랭크")
        items.add("계단 오르기")
        items.add("어썰트 바이크")
        items.add("스텝밀")
        items.add("트레드밀")
        items.add("싸이클")
        items.add("로잉머신")
        items.add("배틀링 로프")
        items.add("핸드스탠드")


        val rv = timeview.findViewById<RecyclerView>(R.id.timeRV)
        val rvAdapter = RvAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        timeview.findViewById<ImageView>(R.id.weightBtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_timeFragment_to_exerciseFragment)







            }
        return timeview
    }

//    여기서부터 운동데이터 넘겨주는 코드
//    레이아웃 내 View 연결
//    inner class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
//        private val itemtitle  = itemView?.findViewById<TextView>(R.id.rvTextId)
//    }

}