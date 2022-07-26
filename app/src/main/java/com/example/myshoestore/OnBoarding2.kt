package com.example.myshoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myshoestore.databinding.Onboarding1Binding
import com.example.myshoestore.databinding.Onboarding2Binding

class OnBoarding2 : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: Onboarding2Binding =
            DataBindingUtil.inflate(inflater,R.layout.onboarding2, container, false)
        binding.button4.setOnClickListener{
                view : View -> Navigation.findNavController(view).navigate(R.id.action_onBoarding2_to_shoplist2)
        }
        return binding.root    }

}