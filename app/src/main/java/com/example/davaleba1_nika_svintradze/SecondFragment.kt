package com.example.davaleba1_nika_svintradze

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val prevBtn : Button = view.findViewById(R.id.previous)
        prevBtn.setOnClickListener{
            val fragment = FirstFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.my_nav,fragment)?.commit()
        }

        return view
    }

}