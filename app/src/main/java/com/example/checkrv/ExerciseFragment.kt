package com.example.checkrv

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ExerciseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val exerciseview = inflater.inflate(R.layout.fragment_exercise, container, false)

        // 데이터 넘겨주는 방식 몰라서 운동리스트 클릭했을 때 넘어가게 만들다
        val gonext = exerciseview.findViewById<ImageView>(R.id.next)
        gonext.setOnClickListener{
            val intent = Intent(getActivity(), FiveActivity::class.java)
            startActivity(intent)}

        val items = mutableListOf<String>()
        items.add("에어스쿼트")
        items.add("런지")
        items.add("점프 스쿼트")
        items.add("스텝업")
        items.add("맨몸 스플릿 스쿼트")
        items.add("맨몸 오버헤드 스쿼트")
        items.add("피스톨 박스 스쿼트")
        items.add("라잉 힙 어브덕션")
        items.add("글루트 브릿지")
        items.add("사이드 라잉 클램")
        items.add("맨몸 카프 레이즈")
        items.add("싱글 레그 글루트 브릿지")
        items.add("푸시업")
        items.add("클랩 푸시업")
        items.add("풀업")
        items.add("싯업")
        items.add("레그 레이즈")
        items.add("크런치")

//      val gonext = exerciseview.findViewById<ImageView>(R.id.next)
        val rv = exerciseview.findViewById<RecyclerView>(R.id.weightRV)
        val rvAdapter = RvAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        exerciseview.findViewById<ImageView>(R.id.timeBtn).setOnClickListener{
            it.findNavController().navigate(R.id.action_exerciseFragment_to_timeFragment)
        }

        return exerciseview

        }

    }

