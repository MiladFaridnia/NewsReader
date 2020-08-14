package com.faridnia.core.data

import com.faridnia.core.domain.NewsItem

interface NewsDataSource {

    suspend fun add(newsItem: NewsItem)
    suspend fun getAll(): List<NewsItem>
    suspend fun remove(newsItem: NewsItem)

}