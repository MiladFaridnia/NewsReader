package com.faridnia.core.interactor

import com.faridnia.core.data.NewsRepository
import com.faridnia.core.domain.NewsItem

class GetAllNews(private val repository: NewsRepository){

    suspend operator fun invoke(newsItem: NewsItem): List<NewsItem> {
        return repository.getAllNews()
    }
}