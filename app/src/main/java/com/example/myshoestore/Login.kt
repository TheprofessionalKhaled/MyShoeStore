package com.example.myshoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.myshoestore.databinding.LoginBinding


class Login : Fragment() {
lateinit var loginViewModel : LoginModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        loginViewModel = ViewModelProvider(requireActivity()).get(LoginModel::class.java)
        val binding : LoginBinding =DataBindingUtil.inflate(inflater,R.layout.login, container, false)
        binding.button.setOnClickListener {
            if (binding.editTextTextPersonName2.text.toString()==loginViewModel.password2.value.toString()  &&binding.editTextTextPersonName.text.toString()==loginViewModel.email2.value.toString()){
                view?.findNavController()?.navigate(R.id.action_login2_to_shoplist2)
            }else{
                Toast.makeText(context,"you are not a customer",Toast.LENGTH_LONG).show()
            }

        }
        binding.button2.setOnClickListener {
            loginViewModel.saveCustomer(binding.editTextTextPersonName.toString(),binding.editTextTextPersonName2.toString())
            view?.findNavController()?.navigate(R.id.action_login2_to_onBoarding1)
        }
        return binding.root
    }


}