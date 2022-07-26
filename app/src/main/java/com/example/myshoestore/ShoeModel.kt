package com.example.myshoestore


import android.os.Parcelable
import androidx.databinding.Bindable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class ShoeModel( var name: String, var size: String, var company: String, var description: String,
                ) : Parcelable


