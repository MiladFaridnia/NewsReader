package com.faridnia.newsreader.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faridnia.core.domain.NewsItem
import com.faridnia.newsreader.R
import kotlinx.android.synthetic.main.news_list_item.view.*

class NewsListAdapter (
    private val news: MutableList<NewsItem> = mutableListOf()
): RecyclerView.Adapter<NewsListAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val newsTitleTextView: TextView = itemView.newsTitleTextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.news_list_item, parent, false))
    }

    override fun getItemCount() = news.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.newsTitleTextView.text = news[position].title
    }

    fun update(newDocuments: List<NewsItem>) {
        news.clear()
        news.addAll(newDocuments)

        notifyDataSetChanged()
    }

}