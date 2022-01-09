package com.example.davaleba1_nika_svintradze

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val nextBtn: Button = view.findViewById(R.id.next)
        nextBtn.setOnClickListener {
            val fragment = SecondFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.my_nav, fragment)?.commit()
        }

        val view2 = inflater.inflate(R.layout.fragment_third, container, false)
        val fragment3: Button = view.findViewById(R.id.button2)
        fragment3.setOnClickListener {
            val fragment = ThirdFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.my_nav, fragment)?.commit()
        }
        return view
    }
    }


