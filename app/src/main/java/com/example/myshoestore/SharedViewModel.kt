package com.example.myshoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {


   private val _product= MutableLiveData<MutableList<ShoeModel>>()
    val product :LiveData<MutableList<ShoeModel>> = _product




fun storeTheProduct(newName : String,newSize:String,newCompany:String , newDescription:String){
_product.value?.add(ShoeModel(newName,newSize,newCompany,newDescription))
}
fun clear(){
    _product.value?.add(ShoeModel("","","",""))

}
}