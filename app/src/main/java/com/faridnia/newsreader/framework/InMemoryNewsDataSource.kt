package com.faridnia.newsreader.framework

import com.faridnia.core.data.NewsDataSource
import com.faridnia.core.domain.NewsItem

class InMemoryNewsDataSource : NewsDataSource{

    private var  news : ArrayList<NewsItem> = arrayListOf()

    override suspend fun add(newsItem: NewsItem) {
        news.add(newsItem)
    }

    override suspend fun getAll(): List<NewsItem> {
        return news
    }

    override suspend fun remove(newsItem: NewsItem) {
        news.remove(newsItem)
    }
}