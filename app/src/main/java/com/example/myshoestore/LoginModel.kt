package com.example.myshoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation


class LoginModel:ViewModel(){
    private var email= MutableLiveData<String>("")
    val email2 :LiveData<String> get() = email

    private var password= MutableLiveData<String>("")
    val password2 :LiveData<String> get() =  password

    init {
        email.value = ""
        password.value = ""
    }






    fun saveCustomer(newEmail : String,newPassword:String ){
       email.value= newEmail
        password.value = newPassword
    }
//    fun alreadyACustomer(newEmail: String ,newPassword: String){
//        if (newEmail==email.value && newPassword==password.value){
//
//        }
//    }


}

