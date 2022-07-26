package com.example.myshoestore

import android.os.Bundle
import android.view.*
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myshoestore.databinding.Onboarding1Binding
import com.example.myshoestore.databinding.ShoplistBinding


/**
 * A simple [Fragment] subclass.
 * Use the [shoplist.newInstance] factory method to
 * create an instance of this fragment.
 */
class shoplist : Fragment() {


lateinit var sharedViewModel: SharedViewModel
private  var ShoeModel : ShoeModel = ShoeModel("","","","")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        sharedViewModel.product.observe(viewLifecycleOwner){
            it.forEach{
             val binding : ShoplistBinding = DataBindingUtil.inflate(inflater,R.id.L1,container,false)
                binding.shoeModel = ShoeModel
                binding.textView5.text= ShoeModel.name
                binding.textView6.text= ShoeModel.size
                binding.textView7.text= ShoeModel.company
                binding.textView8.text= ShoeModel.description

            }
        }

        val binding: ShoplistBinding =
            DataBindingUtil.inflate(inflater,R.layout.shoplist, container, false)
        binding.sharedViewModel =sharedViewModel

        binding.floatingActionButton5.setOnClickListener{
            view : View -> Navigation.findNavController(view).navigate(R.id.action_shoplist2_to_shopdetails)
        }
       setHasOptionsMenu(true)
        return binding.root    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu,menu)
    }


    override fun onOptionsItemSelected(@NonNull item: MenuItem): Boolean {
        when(item.itemId){
            R.id.login2 ->  {               //    Login()

              findNavController().navigate(shoplistDirections.actionShoplist2ToLogin2())
            }
        }
        return super.onOptionsItemSelected(item)
    }

}