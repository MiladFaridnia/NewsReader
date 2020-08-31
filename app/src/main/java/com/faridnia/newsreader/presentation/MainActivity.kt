package com.faridnia.newsreader.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faridnia.newsreader.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(
                    R.id.root_layout,
                    NewsFragment.newInstance(), "newsList")
                .commit()
        }

    }
}
