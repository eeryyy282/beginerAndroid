package com.example.beginerandroid.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero_Internet (
    var name: String,
    var description: String,
    var photo: String
): Parcelable