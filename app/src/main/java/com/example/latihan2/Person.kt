package com.example.latihan2

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract.CommonDataKinds.Email
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person (
    val name: String?,
    val age : Int?,
    val email: String?,
    val city : String?
) : Parcelable

