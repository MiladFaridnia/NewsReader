package com.faridnia.core.domain


data class News(
    val href: String,
    val newsItems: List<NewsItem>,
    val title: String,
    val version: Double
)