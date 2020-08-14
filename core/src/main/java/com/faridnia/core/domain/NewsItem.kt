package com.faridnia.core.domain


import com.google.gson.annotations.SerializedName

data class NewsItem(
    val href: String,
    val ingredients: String,
    val thumbnail: String,
    val title: String
)