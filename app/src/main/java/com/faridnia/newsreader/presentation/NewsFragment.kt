package com.faridnia.newsreader.presentation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.faridnia.core.domain.NewsItem
import com.faridnia.newsreader.R
import kotlinx.android.synthetic.main.fragment_news.view.*


class NewsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_news, container, false)

        val testNews = mutableListOf<NewsItem>()
        testNews.add(NewsItem("sss","sssssfff", "thhhhh", "1sstetut"))
        testNews.add(NewsItem("sss","sssssfff", "thhhhh", "2sstetut"))
        testNews.add(NewsItem("sss","sssssfff", "thhhhh", "3sstetut"))
        testNews.add(NewsItem("sss","sssssfff", "thhhhh", "4sstetut"))
        testNews.add(NewsItem("sss","sssssfff", "thhhhh", "5sstetut"))


        val activity = activity as Context
        view.newsRecyclerView.layoutManager = LinearLayoutManager(activity)
        view.newsRecyclerView.adapter = NewsListAdapter(testNews)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    companion object {
        @JvmStatic
        fun newInstance() = NewsFragment()
    }
}
