package com.faridnia.core.domain


import com.faridnia.core.domain.NewsItem
import com.google.gson.annotations.SerializedName

data class News(
    val href: String,
    val newsItems: List<NewsItem>,
    val title: String,
    val version: Double
)