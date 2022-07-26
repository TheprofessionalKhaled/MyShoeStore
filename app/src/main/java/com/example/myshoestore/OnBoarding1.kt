package com.example.myshoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation

import com.example.myshoestore.databinding.Onboarding1Binding


class OnBoarding1 : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding:Onboarding1Binding =DataBindingUtil.inflate(inflater,R.layout.onboarding1, container, false)
        binding.button3.setOnClickListener{
                view : View -> Navigation.findNavController(view).navigate(R.id.action_onBoarding1_to_onBoarding2)
        }
        return binding.root
        // Inflate the layout for this fragment

    }


}