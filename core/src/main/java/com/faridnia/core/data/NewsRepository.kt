package com.faridnia.core.data

import com.faridnia.core.domain.NewsItem

class NewsRepository(private val newsDataSource: NewsDataSource) {

    suspend fun addNews(newsItem: NewsItem) {
        newsDataSource.add(newsItem)
    }

    suspend fun removeNews(newsItem: NewsItem) {
        newsDataSource.remove(newsItem)
    }

    suspend fun getAllNews() = newsDataSource.getAll()

}
