package com.example.myshoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.myshoestore.databinding.Onboarding1Binding
import com.example.myshoestore.databinding.ShopdetailBinding

class shopdetails : Fragment() {

    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: ShopdetailBinding =
            DataBindingUtil.inflate(inflater,R.layout.shopdetail, container, false)

        binding.button6.setOnClickListener { view :View -> view.findNavController().navigate(R.id.action_shopdetails_to_shoplist2) }
        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        binding.sharedViewModel = sharedViewModel
        binding.setLifecycleOwner (this)

        binding.button6.setOnClickListener {
            sharedViewModel.storeTheProduct(
                binding.editTextTextPersonName3.text.toString(),
                binding.editTextTextPersonName6.text.toString(),
                binding.editTextTextPersonName4.text.toString(),
                binding.editTextTextPersonName5.text.toString(),

                )}
        binding.button5.setOnClickListener {
            sharedViewModel.clear()
        }

        return binding.root    }




}